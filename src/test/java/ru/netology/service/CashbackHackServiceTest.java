package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;



 public class CashbackHackServiceTest {

    @Test
    public  void testRemain() {
        CashbackHackService service= new CashbackHackService();
        int amount =950;
        int expected = 50;
        int actual  = service.remain();
        Assert.assertEquals(actual,expected);
    }
}