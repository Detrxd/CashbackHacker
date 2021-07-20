package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void zeroCashBackNeed900Amount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 100;
        int expected = 900;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void dealCashBackSayNothing() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void zeroAmountSayNeedOneThousandAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    public void overLimitAmountSayNeed500Amount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;
        int actual = service.remain(amount);
        int expected = 500;
        assertEquals(actual, expected);
    }
    @Test
    public void overLimitAmountSayNothing() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

}