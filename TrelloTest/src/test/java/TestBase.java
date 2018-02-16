import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {
    FirefoxDriver wd;



    @BeforeClass
    public void setUp() throws Exception {
        wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        openSite("https://trello.com/");
    }

    protected void confirmLogin() {
        wd.findElement(By.id("login")).click();
    }

    protected void enterPassword(String password) {
        wd.findElement(By.id("password")).click();
        wd.findElement(By.id("password")).clear();
        wd.findElement(By.id("password")).sendKeys(password);
    }

    protected void enterUserName(String userName) {
        wd.findElement(By.id("user")).click();
        wd.findElement(By.id("user")).clear();
        wd.findElement(By.id("user")).sendKeys(userName);
    }


    protected void openSite(String url) {
        wd.get(url);
    }

    protected void clickLoginButton() {
        wd.findElement(By.linkText("Log In")).click();
    }

    @AfterClass
    public void tearDown() {
        wd.quit();
    }

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }



    private void logout() {
        wd.findElement(By.cssSelector("span.member-initials")).click();
        wd.findElementByCssSelector("a.js-logout").click();
    }



    public void login(String user, String pwd){
        clickLoginButton();
        enterUserName(user);
        enterPassword(pwd);
        confirmLogin();
    }
}