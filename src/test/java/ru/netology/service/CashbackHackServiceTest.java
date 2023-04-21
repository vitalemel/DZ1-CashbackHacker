package ru.netology.service;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



 public class CashbackHackServiceTest {
    @Test
    public void testRemain() {

        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }


}