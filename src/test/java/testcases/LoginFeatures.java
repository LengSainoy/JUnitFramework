package testcases;

import hooks.Hooks;
import org.junit.*;
import org.openqa.selenium.By;
import pages.HomePage;
import pages.LoginPage;
import utilities.Configs;

public class LoginFeatures extends Hooks {
   HomePage homePage = new HomePage();
   LoginPage loginPage = new LoginPage();

   @Test
   public void loginWithValidUsernameAndPassword() {
      driver.get(Configs.getProperty("baseUrl"));
      driver.findElement(homePage.myAccountMenu).click();
      System.out.println("Testing Script");
      loginPage.doLogin("username", "password");
   }
}
