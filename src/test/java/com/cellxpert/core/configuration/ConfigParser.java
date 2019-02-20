package com.cellxpert.core.configuration;

import org.yaml.snakeyaml.Yaml;

import java.io.*;
import java.util.Map;

public class ConfigParser {

    private static final String CONFIG_FILE_NAME = "./config.yml";

    public static String getValue(String key) {
         Yaml yaml = new Yaml();
         try {
             Reader yamlFile = new FileReader(CONFIG_FILE_NAME);

             Map<String, Object> yamlMaps = yaml.load(yamlFile);
             return (String) yamlMaps.get(key);
         } catch (Exception e) {
             System.out.println(e);
         }
         return null;
     }
}
