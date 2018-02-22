package com.telRan.course.tests;

import com.telRan.course.model.BoardData;
import org.testng.annotations.Test;

public class BoardRenameTest extends TestBase {


    @Test
    public void testRenameBoard() {
        app.findBoard("TestBoard");
        app.clickBoardName();
        app.fillRenameBoardTitle(new BoardData("ForListTests"));
        app.clickConfirmRenameBoardButton();
        app.returnToHomepage();
        app.clickSpareSpace();

    }


}
