package com.telRan.course.tests;

import com.telRan.course.model.BoardData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BoardRenameTest extends TestBase {


    @Test
    public void testRenameBoard() {
      //  app.getNavigationHelper().goToHomepage();
        int before = app.getBoardHelper().getBoardCount();
        app.getBoardHelper().findBoard("123");
        app.getBoardHelper().clickBoardName();
        app.getBoardHelper().fillRenameBoardTitle(new BoardData("1313"));
        app.getBoardHelper().clickConfirmRenameBoardButton();
        app.getNavigationHelper().goToHomepage();
        int after = app.getBoardHelper().getBoardCount();
        Assert.assertEquals(after, before);
        app.getBoardHelper().clickBoardSpareSpace();

    }


}
