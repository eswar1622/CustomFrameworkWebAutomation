package org.seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest {
    @Test
    public void search(){
        driver.findElement(By.name("q")).sendKeys("News", Keys.ENTER);
        System.out.println(driver.getTitle());

    }
    @Test
    public void searchSelenium(){
        driver.findElement(By.name("q")).sendKeys("selenium", Keys.ENTER);
        System.out.println(driver.getTitle());

    }
}
