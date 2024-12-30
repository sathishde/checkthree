package com.qa.tests;
import org.testng.annotations.Test;
import org.testng.Assert;

public class LoginTest {

    @Test
    public void login(){
        System.out.println("SUM IS");
        int a = 10;
        int b = 20;
        Assert.assertEquals(30, a+b);
    }

}
