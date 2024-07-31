package com.learning.java.test;

import com.learning.java.predicate.RulesEngine;
import com.learning.java.supplier.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import java.util.List;

public class DriverTestWithStreams {

    private WebDriver driver;

    @BeforeTest
    @Parameters("browser")
    public void setDriver(@Optional("chrome") String browser){
        this.driver = DriverFactory.getDriver(browser);
    }

    @Test
    public void googleTest(){
        this.driver.get("https://google.com");
        this.driver.findElements(By.tagName("a"))
                .stream()
                .map(WebElement::getText)
                .map(String::trim)
                .filter(e -> e.length() > 0)
                .filter(i -> !i.toLowerCase().contains("s"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }

    @AfterTest
    public void quitDriver(){
        this.driver.quit();
    }

}
