package com.marioplus.mdsteam.export;


import com.marioplus.mdsteam.utils.YamlFc;
import lombok.Cleanup;
import org.apache.commons.io.FileUtils;

import java.io.*;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @author marioplus
 * @date 2020/1/2 18:54
 **/
public class Export {

    private static final String CONFIG_PATH = "./src/main/resources/config/export.yml";

    public static void main(String[] args) {

        ExportConfig exportConfig;
        try {
            exportConfig = getExportConfig();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("获取配置文件失败");
            return;
        }

        StringBuilder sb = new StringBuilder();
        Supplier<RuntimeException> supplier = () -> new RuntimeException("解析配置出错");
        exportConfig.configs.forEach(config -> {
            // 到处信息
            sb.append("/* \n");
            sb.append(" * @date ").append(LocalDateTime.now().toString()).append("\n");
            sb.append(" */\n");
            // 写注释
            sb.append("/* \n");
            sb.append(" * ").append(config.note).append("\n");
            sb.append(" * ").append(config.fileName).append("\n");
            sb.append(" */\n");

            // 匹配网址
            String matchStr = config.matches.stream()
                    .flatMap(match -> match.params
                            .stream()
                            .map(param -> String.format("%s(\"%s\")", match.mode, param))
                    ).reduce((m1, m2) -> String.format("%s, %s", m1, m2)).orElseThrow(supplier);
            sb.append("@-moz-document ").append(matchStr).append(" {\n");

            // 文件内容
            String path = exportConfig.getPath().source.concat(config.fileName);
            try {
                String content = FileUtils.readFileToString(new File(path), "UTF-8");
                content = Arrays.stream(content.split("\n"))
                        .map("\t"::concat)
                        .reduce((c1, c2) -> c1.concat("\n").concat(c2))
                        .orElseThrow(() -> new NullPointerException("文件内容为空"));
                sb.append(content).append("\n}\n\n");
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("解析文件失败");
            }
        });

        // 写入文件;
        try {
            File file = new File(exportConfig.path.out);
            FileUtils.writeStringToFile(file, sb.toString(), "UTF-8");
            System.out.println("导出完成");
            System.out.println(file.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("导出失败");
            e.printStackTrace();
        }
        System.out.println(LocalDateTime.now().toString());
    }

    private static ExportConfig getExportConfig() throws IOException {
        return new YamlFc<>(ExportConfig.class).build(CONFIG_PATH);
    }
}
