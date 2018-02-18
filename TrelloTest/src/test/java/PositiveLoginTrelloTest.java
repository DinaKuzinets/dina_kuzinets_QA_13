import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;


public class PositiveLoginTrelloTest extends TestBase {

    private String user = "dkuzinets@gmail.com";
    private String pwd = "TelRan17";

    @Test
    public void LoginTrelloTest(){
        login(user, pwd);
        logout();
    }


//    @BeforeMethod
//    public void createPreconditions(){
//        openSite("https://trello.com/");
//    }

//    @Test
//    public void LoginTrelloTest() {
//        clickLoginButton();
//        enterUserName("dkuzinets@gmail.com");
//        enterPassword("TelRan17");
//        confirmLogin();
//        logout();
//    }



//        private void logout() {
//            wd.findElement(By.cssSelector("img.member-avatar")).click();
//            wd.findElementByCssSelector("a.js-logout").click();
//        }

}