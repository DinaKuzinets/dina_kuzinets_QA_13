package com.tr.selenium.Tests;

import com.tr.selenium.application.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;

import java.lang.reflect.Method;

public class TestBase {

    Logger logger = LoggerFactory.getLogger(TestBase.class);


    protected static final ApplicationManager app =
            new ApplicationManager(System.getProperty("browser",BrowserType.FIREFOX));

    @BeforeSuite
    public void setUp() throws Exception {
        app.start();
    }

    @AfterSuite
    public void tearDown() {
        app.stop();
    }


    @BeforeMethod
    public void startLog(Method m){
        logger.info("Start test " + m);
    }

    @AfterMethod
    public void stoptLog(Method m){
        app.getBrowserLog();
        logger.info("Stop test " + m);
    }





}
