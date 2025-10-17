package com;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
     void testInitialBalanceIsZero() {
        BankAccount account = new BankAccount();
        assertEquals(0, account.getBalance(), "Initial balance should be zero");
    }

    @Test
     void testDepositIncreasesBalance() {
        BankAccount account = new BankAccount();
        account.deposit(100);
        assertEquals(100, account.getBalance(), "Balance should be 100 after depositing 100");
    }

    @Test
     void testWithdrawDecreasesBalance() {
        BankAccount account = new BankAccount();
        account.deposit(200);
        account.withdraw(50);
        assertEquals(150, account.getBalance(), "Balance should be 150 after withdrawing 50");
    }

    @Test
     void testWithdrawMoreThanBalanceFails() {
        BankAccount account = new BankAccount();
        account.deposit(100);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(200);
        });
        assertEquals("Insufficient balance", exception.getMessage());
    }

    @Test
     void testNegativeDepositFails() {
        BankAccount account = new BankAccount();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-10);
        });
        assertEquals("Deposit amount must be positive", exception.getMessage());
    }

    @Test
     void testNegativeWithdrawFails() {
        BankAccount account = new BankAccount();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(-20);
        });
        assertEquals("Withdraw amount must be positive", exception.getMessage());
    }
}
