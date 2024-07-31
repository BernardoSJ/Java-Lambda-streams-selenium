package com.learning.java.test;

import com.google.common.util.concurrent.Uninterruptibles;
import com.learning.java.pages.TableDemoPage;
import com.learning.java.supplier.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;

public class DriverTestCheckboxExercise {

    private WebDriver driver;
    private TableDemoPage tableDemoPage;



    @BeforeTest
    @Parameters("browser")
    public void setDriver(@Optional("chrome") String browser){
        this.driver = DriverFactory.getDriver(browser);
        this.tableDemoPage = new TableDemoPage(driver);
    }

    @DataProvider(name = "criteriaProvider")
    public Object testData(){


        return new Object[]{
                SearchCriteriaFactory.getCriteria("allMale"),
                SearchCriteriaFactory.getCriteria("allFemale"),//allFemale,
                SearchCriteriaFactory.getCriteria("allGender"),//allGender,
                SearchCriteriaFactory.getCriteria("allAU"),//allAU,
                SearchCriteriaFactory.getCriteria("allFemaleAU")//allFemaleAU
        };
    }

    @Test(dataProvider = "criteriaProvider")
    public void tableRowTest(Predicate<List<WebElement>> searchCriteria){
        tableDemoPage.goTo();
        tableDemoPage.selectRows(searchCriteria);
        Uninterruptibles.sleepUninterruptibly(1, TimeUnit.SECONDS);
    }



    @AfterTest
    public void quitDriver(){
        this.driver.quit();
    }


}
