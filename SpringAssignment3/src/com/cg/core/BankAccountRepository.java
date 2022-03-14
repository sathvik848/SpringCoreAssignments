package com.cg.core;

import org.springframework.stereotype.Component;

@Component("bankAccountRepository")
public interface BankAccountRepository {

    public Double getBalance11(Long accountId);
    public Double updateBalance(Long accountId, Double newBalance);
	public Double getBalance1(Long accountId);
	public Double getBalance(Long accountId);

}