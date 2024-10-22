package collection;

import java.util.Properties;
import java.util.Set;

public class PropertiesEx {
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.setProperty("timeout","30");
        prop.setProperty("language","kr");
        prop.setProperty("size","10");
        prop.setProperty("capacity","10");

        System.out.println(prop);
        System.out.println(prop.size());

        System.out.println(prop.getProperty("timeout"));
        System.out.println(prop.getProperty("language"));

        Set<String> names = prop.stringPropertyNames();
        for(String name : names){
            System.out.println(name);
        }

        Properties prop2 = System.getProperties();

        Set<String> keys = prop2.stringPropertyNames();
        for(String key : keys){
            System.out.println(key);
        }

        System.out.println(prop2.getProperty("os.name"));
        System.out.println(prop2.getProperty("java.version"));
    }
}
