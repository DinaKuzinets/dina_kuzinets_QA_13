import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;


public class LoginTrelloTest extends TestBase {

    @BeforeMethod
    public void createPreconditions(){
        openSite("https://trello.com/");
    }

    @Test(priority = 1)
    public void LoginTrelloTest() {
        //openSite();
        // wd.findElement(By.xpath("//div[2]")).click();
        clickLoginButton();
        enterUserName("elena.telran@yahoo.com");
        enterPassword("12345.com");
        confirmLogin();
        logout();
    }


    @Test(priority = 3)
         public void ALoginTrelloTestNotValidmail()
        {
            clickLoginButton();
            enterUserName("1");
            enterPassword("12345.com");
            confirmLogin();

        }


    @Test(priority = 2)
    public void BLoginTrelloemptiFieldTest() {

        clickLoginButton();
        enterUserName("");
        enterPassword("");
        confirmLogin();
        }


        private void logout() {
            wd.findElement(By.cssSelector("span.member-initials")).click();
            wd.findElementByCssSelector("a.js-logout").click();
        }

}