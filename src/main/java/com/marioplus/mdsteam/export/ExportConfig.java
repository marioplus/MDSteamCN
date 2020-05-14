package com.marioplus.mdsteam.export;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @author xianglei
 * @date 2020/1/2 18:57
 **/
@Data
public class ExportConfig {

    public Path path;
    public List<Config> configs;

    @Data
    public static class Path {
        public String source;
        public String out;
    }

    @Data
    public static class Config {
        public String note;
        @JsonProperty(value = "file-name")
        public String fileName;
        public List<Match> matches;
    }

    @Data
    public static class Match {
        public String mode;
        public List<String> params;
    }
}
