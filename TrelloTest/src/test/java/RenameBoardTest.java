import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RenameBoardTest extends TestBase {

    private String user = "dkuzinets@gmail.com";
    private String pwd = "TelRan17";
    private String boardName = "TestBoard";
    private String newBoardName = "FirstTestBoard";

@Test
    public void renameBoard(){
        login(user,pwd);
        findBoard(boardName);
        renameB(newBoardName);
        logout();
    }

    public void findBoard(String boardName){
        wd.findElementByLinkText(boardName).click();

    }

   public void renameB(String newBoardName){
       wd.findElement(By.cssSelector("span.board-header-btn-text")).click();
       wd.findElement(By.cssSelector("input.js-board-name.js-autofocus")).click();
       wd.findElement(By.cssSelector("input.js-board-name.js-autofocus")).clear();
       wd.findElement(By.cssSelector("input.js-board-name.js-autofocus")).sendKeys(newBoardName);
       wd.findElement(By.cssSelector("input.primary.wide.js-rename-board")).click();
   }
}
