package hooks;

import utilities.Driver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {
   public WebDriver driver;
   @Before
   public void init() {
      driver = Driver.getDriver();
   }

   @After
   public void tearDown() {
      Driver.closeDriver();
   }
}
