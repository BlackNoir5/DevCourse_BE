package stream;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class ClassStream3Ex {
    public static void main(String[] args) {
        // Map
        // Properties( 시스템의 환경 )
        // 저장기능

        Properties prop = new Properties();
        prop.setProperty("id","andy");
        prop.setProperty("password","1234");
        prop.setProperty("grade","A");

        //System.out.println(prop);
        FileWriter fw = null;

        try {
            fw = new FileWriter("./config.properties");
            prop.store(fw,"System config");
            System.out.println("저장완료");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if(fw != null){ try { fw.close(); } catch (IOException e) { } }
        }
    }
}
