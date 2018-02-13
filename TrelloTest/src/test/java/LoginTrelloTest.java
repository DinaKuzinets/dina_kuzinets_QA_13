import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;


public class LoginTrelloTest extends TestBase {

    @Test
    public void LoginTrelloTest() {
        openSite();
        // wd.findElement(By.xpath("//div[2]")).click();
        clickLoginButton();
        enterUserName("elena.telran@yahoo.com");
        enterPassword("12345.com");
        confirmLogin();
    }

}