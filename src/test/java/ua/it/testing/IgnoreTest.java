package ua.it.testing;

import org.testng.annotations.Test;

public class IgnoreTest {
    @Test
    public void testOne(){
        System.out.println("IgnoreTest.testOne");
    }
    @Test
    public void testTwo(){
        System.out.println("IgnoreTest.testTwo");
    }
}
