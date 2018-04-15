package com.telRan.course.tests;

import com.telRan.course.application.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;

import java.lang.reflect.Member;
import java.lang.reflect.Method;

public class TestBase  {

    Logger logger = LoggerFactory.getLogger(TestBase.class);

    protected static ApplicationManager app = new ApplicationManager(BrowserType.FIREFOX);

    @BeforeSuite
    public void setUp() throws Exception {
        app.init();
    }


    @AfterSuite
    public void tearDown() {
        app.stop();
    }


    @BeforeMethod
    public void startLog(Method m){
        logger.info("Start test " + m.getName() );
    }


    @AfterMethod
    public void stoptLog(Method m){
        app.getBrowserLog();
        logger.info("Stop test " + m.getName() );
    }

}