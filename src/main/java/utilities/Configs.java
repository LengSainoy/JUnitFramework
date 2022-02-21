package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configs {
   private static Properties prop;

   static {
      String filePath = "C:\\Users\\Lengg\\Documents\\PracticeAutomationJUnit\\src\\test\\resources\\configuration.properties";
      FileInputStream fis = null;
      try {
         fis = new FileInputStream(filePath);
         prop = new Properties();
         prop.load(fis);
         fis.close();
      } catch (IOException e) {
         System.out.println("Filepath is incorrect");
      }
   }

   public static String getProperty(String keyName) {
      return prop.getProperty(keyName);
   }
}
