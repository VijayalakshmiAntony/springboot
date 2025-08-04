package com.bank.balance.repositoryimpl;

import org.springframework.stereotype.Repository;

import com.bank.balance.repository.AccountRepository;

@Repository
public class AccountRepositoryImpl implements AccountRepository {
    @Override
    public String getBalance() {
        return "Your current balance is $5000.";
    }
}