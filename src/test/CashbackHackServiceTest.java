package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;
public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();


    @Test
    void shouldReturn100IfAmountIs900() {

        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;

        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }
}