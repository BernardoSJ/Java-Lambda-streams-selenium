package com.learning.java.supplier;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class DriverFactory {

    private static final Supplier<WebDriver> chromeSupplier = () -> {
        //System.setProperty("webdriver.chrome.driver","drivers/chrome-driver/chrome.exe");

        return new ChromeDriver();
    };

    private static final Map<String, Supplier<WebDriver>> map = new HashMap<>();

    static {
        map.put("chrome", chromeSupplier);
    }

    public static WebDriver getDriver(String browser){
        return map.get(browser).get();
    }
}
