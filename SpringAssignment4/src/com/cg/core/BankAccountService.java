package com.cg.core;

public interface BankAccountService {

    public Double withdraw(Long accountId, Double balance);
    public Double deposit(Long accountId, Double balance);
    public Double getBalance(Long accountId);
    public Boolean fundTransfer(Long fromAccount, Long toAccount, Double amount);

}