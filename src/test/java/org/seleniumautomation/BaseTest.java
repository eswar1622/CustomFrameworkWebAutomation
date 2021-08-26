package org.seleniumautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.gecko.driver", FrameworkConstants.getFirefoxdriverpath());
        driver = new FirefoxDriver();
        driver.get("https://www.google.com");

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
