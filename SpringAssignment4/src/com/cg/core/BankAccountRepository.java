package com.cg.core;

import org.springframework.stereotype.Component;

@Component("bankAccountRepository")
public interface BankAccountRepository {

    public Double getBalance(Long accountId);
    public Double updateBalance(Long accountId, Double newBalance);

}