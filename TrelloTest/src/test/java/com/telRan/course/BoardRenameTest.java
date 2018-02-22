package com.telRan.course;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BoardRenameTest extends TestBase {

    public String boardName = "TestBoard";
    public String newBoardName = "FirstTestBoard";

    @Test
    public void renameBoard() {
        findOpenBoard(boardName);
        clickBoardName();
        renameB(newBoardName);
        clickConfirmRenameButton();
        returnToHomepage();
        clickSpareSpace();

    }


}
