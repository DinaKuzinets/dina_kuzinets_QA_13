import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RenameBoardTestClass extends TestBase {
    @BeforeClass
    public void precondition(){
        login("elena.telran@yahoo.com", "12345.com");
    }


    @Test
    public void testRenameBoard(){
    selectBoard();

    }

    public void selectBoard() {
        wd.findElement(By.cssSelector("span[title=QA-13]")).click();
    }
}
