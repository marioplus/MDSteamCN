package com.marioplus.mdsteam.export;


import com.marioplus.mdsteam.utils.YamlFc;

import java.io.*;
import java.time.LocalDateTime;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @author marioplus
 * @date 2020/1/2 18:54
 **/
public class Export {
    public static void main(String[] args) {
        ExportConfig exportConfig = getExportConfig();

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
            String path = exportConfig.getPath().css.concat("/").concat(config.fileName);
            InputStream is = getResourceAsStream(path);
            forEachLineOfStream(is, line -> sb.append("\t").append(line).append("\n"));
            sb.append("}\n\n");
        });

        // 写入文件
        String outPath = exportConfig.path.out.concat("/main.css");
        writeFile(outPath, sb.toString());

    }

    private static ExportConfig getExportConfig() {
        InputStream is = getResourceAsStream("config/export.yml");
        return new YamlFc<>(ExportConfig.class).build(is);
    }

    private static InputStream getResourceAsStream(String path) {
        return Export.class.getClassLoader().getResourceAsStream(path);
    }

    private static void forEachLineOfStream(InputStream is, Consumer<String> consumer) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        String line;
        try {
            while ((line = reader.readLine()) != null) {
                consumer.accept(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("解析配置出错");
        }
    }

    private static void writeFile(String path, String content) {
        try {
            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter writer = new FileWriter(file);
            writer.append(content).flush();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("写入文件失败");
        }
    }
}
