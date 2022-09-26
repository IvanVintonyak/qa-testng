package ua.it.testing;

import org.testng.Assert;
import org.testng.annotations.Test;
import retry.MyRetry;

public class RetryTest {

    @Test(retryAnalyzer = MyRetry.class)
    public void testRetry(){
        System.out.println("This is RetryTest");
        Assert.assertTrue(true);
    }
    @Test()
    public void testRetryWithListener(){
        System.out.println("This is RetryTest");
        Assert.assertTrue(true);
    }
}
