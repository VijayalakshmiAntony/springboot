package com.bank.balance;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import com.bank.balance.controller.BalanceController;
import com.bank.balance.service.BalanceService;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BalanceControllerTest {

    @Autowired
    private BalanceController balanceController;

    @MockitoBean
    private BalanceService balanceService;

    @Test
    void checkBalance() {
        when(balanceService.getBalance()).thenReturn("Your current balance is $5000.");
        String balance = balanceController.checkBalance();
        assertEquals("Your current balance is $5000.", balance);
    }
}