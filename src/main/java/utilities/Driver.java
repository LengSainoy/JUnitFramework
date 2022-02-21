package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {
   private static WebDriver driver;

   public static WebDriver getDriver() {
      String browser = Configs.getProperty("browser").toLowerCase();
      if (driver == null) {
         switch (browser) {
            case "chrome":
               WebDriverManager.chromedriver().setup();
               driver = new ChromeDriver();
               break;
            case "firefox":
               WebDriverManager.firefoxdriver().setup();
               driver = new FirefoxDriver();
               break;
            case "edge":
               WebDriverManager.edgedriver().setup();
               driver = new EdgeDriver();
               break;
            default:
               throw new IllegalArgumentException("Please enter the correct browser name");
         }
      }
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.manage().deleteAllCookies();
      return driver;
   }

   public static void closeDriver() {
      if (driver != null) driver.quit();
   }
}
