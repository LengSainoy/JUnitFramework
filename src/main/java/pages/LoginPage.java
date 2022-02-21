package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

public class LoginPage {
   WebDriver driver = Driver.getDriver();
   private By inputUsername = By.id("username");
   private By inputPassword = By.id("password");
   private By loginBtn = By.cssSelector("input[name='login']");


   public void doLogin(String username, String password) {
      enterValue(inputUsername,username);
      enterValue(inputPassword,password);
      driver.findElement(loginBtn).click();
   }
   public void doLogin(String username) {
      enterValue(inputUsername,username);
      driver.findElement(loginBtn).click();
   }
   private void enterValue(By locator, String value) {
      driver.findElement(locator).sendKeys(value);
   }
}
