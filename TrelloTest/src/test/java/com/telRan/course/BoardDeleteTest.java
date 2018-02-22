package com.telRan.course;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BoardDeleteTest extends TestBase {



    public String boardName = "TestBoard";

    @Test
    public void DelBoard() {
        findBoard(boardName);
        openMenuMore();
        selectCloseBoard();
        clickConfirmCloseButton();
        returnToHomepage();
        clickSpareSpace();
    }


}