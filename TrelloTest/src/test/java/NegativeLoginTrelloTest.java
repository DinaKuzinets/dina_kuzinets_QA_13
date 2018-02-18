import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class NegativeLoginTrelloTest extends TestBase {

    @BeforeMethod
    public void createPreconditions(){
        openSite("https://trello.com/");
    }


    @Test
public void ALoginTrelloTestNotValidmail(){
    login("dkuzinets@gmail.com", "12345");
}

    @Test
    public void BLoginTrelloTestNotValidmail(){
        login(" ", " ");
    }

//    @Test(priority = 1)
//         public void ALoginTrelloTestNotValidmail()
//        {   ;
//            enterUserName("dkuzinets@gmail.com");
//            enterPassword("12345.com");
//            confirmLogin();
//
//        }


//    @Test(priority = 2)
//    public void BLoginTrelloemptiFieldTest() {
//
//        clickLoginButton();
//        enterUserName("");
//        enterPassword("");
//        confirmLogin();
//        }




}