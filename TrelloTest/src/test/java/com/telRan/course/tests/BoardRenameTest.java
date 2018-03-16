package com.telRan.course.tests;

import com.telRan.course.model.BoardData;
import org.testng.annotations.Test;

public class BoardRenameTest extends TestBase {


    @Test
    public void testRenameBoard() {
        app.getBoardHelper().findBoard("123");
        app.getBoardHelper().clickBoardName();
        app.getBoardHelper().fillRenameBoardTitle(new BoardData("1313"));
        app.getBoardHelper().clickConfirmRenameBoardButton();
        app.getNavigationHelper().returnToHomepage();
        app.getBoardHelper().clickSpareSpace();

    }


}
