package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties = new Properties();

    static {

        try{
            FileInputStream file = new FileInputStream("src/test/config.properties");
            properties.load(file);
        }catch (IOException e){
            System.out.printf("File Not Found in given path");
            e.printStackTrace();
        }
    }

    public static String getProperty(String key){
        return properties.getProperty(key);

    }
}
