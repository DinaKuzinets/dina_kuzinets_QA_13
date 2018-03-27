package com.telRan.course.tests;

import com.telRan.course.application.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class TestBase  {


    protected final ApplicationManager app = new ApplicationManager(BrowserType.FIREFOX);

    @BeforeSuite
    public void setUp() throws Exception {
        app.init();
    }


    @AfterSuite
    public void tearDown() {
        app.stop();
    }


}