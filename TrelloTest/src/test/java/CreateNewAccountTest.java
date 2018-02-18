import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateNewAccountTest extends TestBase {

    private String perName = "Dina";
    private String email = "dkuzinets@mail.ru";
    private String pwd = "12345";


    @Test
    public void NewAccount(){
        clickSighUpButton();
        personName(perName);
        enterEmail(email);
        enterPassword(pwd);
        comfirmSignUpButton();
    }

    private void clickSighUpButton() {
        wd.findElement(By.linkText("Sign Up")).click();
    }


    private void personName(String perName) {
        wd.findElement(By.id("name")).click();
        wd.findElement(By.id("name")).clear();
        wd.findElement(By.id("name")).sendKeys(perName);
    }

    private void enterEmail(String email) {
        wd.findElement(By.id("email")).click();
        wd.findElement(By.id("email")).clear();
        wd.findElement(By.id("email")).sendKeys(email);
    }

    private void comfirmSignUpButton() {
        wd.findElement(By.id("signup")).click();
    }


}
