package com.marioplus.mdsteam.utils;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLParser;
import com.marioplus.mdsteam.export.ExportConfig;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author xianglei
 * @date 2020/1/3 16:19
 **/
public class YamlFc<T> {
    private final YAMLFactory factory;
    private final ObjectMapper mapper;
    private final Class<T> clazz;

    public YamlFc(Class<T> clazz) {
        this.clazz = clazz;
        this.factory = new YAMLFactory();
        this.mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    public T build(String path) throws IOException {
        InputStream is = new FileInputStream(path);
        return this.build(is);
    }

    public T build(InputStream is) {
        try {
            YAMLParser parser = factory.createParser(is);
            JsonNode node = mapper.readTree(parser);
            TreeTraversingParser treeTraversingParser = new TreeTraversingParser(node);
            return mapper.readValue(treeTraversingParser, clazz);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("解析yaml失败");
            return null;
        }
    }

    public static void main(String[] args) {
        InputStream is = YamlFc.class.getClassLoader().getResourceAsStream("config\\export.yml");
        ExportConfig config = new YamlFc<>(ExportConfig.class).build(is);
        System.out.println(config);
    }

}
