package ua.it.testing;

import org.testng.Assert;
import org.testng.annotations.*;

public class SecondTest {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("FirstTest.beforeSuite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("FirstTest.afterSuite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("FirstTest.beforeTest");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("FirstTest.afterTest");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("FirstTest.beforeClass");

    }

    @AfterClass

    public void afterClass() {
        System.out.println("FirstTest.afterClass");
    }

    @BeforeGroups
    public void beforeGroup() {
        System.out.println("FirstTest.beforeGroup");
    }

    @AfterGroups
    public void afterGroup() {
        System.out.println("FirstTest.afterGroup");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("FirstTest.beforeMethod");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("FirstTest.afterMethod");
    }


    @Test
    public void testTwo() {
        Assert.assertTrue(true);
    }
}
