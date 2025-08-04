package com.bank.balance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.balance.repository.AccountRepository;

@Service
public class BalanceService {
    private final AccountRepository accountRepository;

    @Autowired
    public BalanceService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public String getBalance() {
        return accountRepository.getBalance();
    }
}