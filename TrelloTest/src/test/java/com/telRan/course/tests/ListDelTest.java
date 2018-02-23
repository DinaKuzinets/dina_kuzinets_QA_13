package com.telRan.course.tests;

import org.testng.annotations.Test;

public class ListDelTest extends TestBase{

    @Test
    public void testDelBoard(){
        app.findBoard("ForListTests");
        app.findList();

    }
}
