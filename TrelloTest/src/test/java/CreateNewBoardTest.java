import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateNewBoardTest extends TestBase{

    private String user = "dkuzinets@gmail.com";
    private String pwd = "TelRan17";
    private String boardName = "TestBoard";

@Test
    public void NewBoard(){
    login(user,pwd);
    createNewBoard(boardName);
    wd.findElement(By.cssSelector("a.board-menu-header-close-button.icon-lg.icon-close.js-hide-sidebar")).click();
    logout();
}


    private void createNewBoard(String boardName) {
        wd.findElement(By.cssSelector("span.header-btn-icon.icon-lg.icon-add.light")).click();
        wd.findElement(By.cssSelector("a.js-new-board")).click();
        wd.findElement(By.cssSelector("input.subtle-input")).sendKeys(boardName);
        wd.findElement(By.cssSelector("button.primary")).click();
    }
}
