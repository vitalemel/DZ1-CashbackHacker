package ru.netology.service;






 public class CashbackHackServiceTest {
    @ Test
    public void testRemain() {

        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;

        Assertions.(expected, actual);
    }


}