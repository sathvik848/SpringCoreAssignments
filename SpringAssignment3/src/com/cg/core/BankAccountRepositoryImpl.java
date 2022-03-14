package com.cg.core;


public class BankAccountRepositoryImpl implements BankAccountRepository {

    Database database;

    public void setDatabase(Database database) {
        this.database = database;
    }

    public Double getBalance(Long accountId){
        return this.database.getBankAccount(accountId).getAccountBalance();
    }

    public Double updateBalance(Long accountId, Double newBalance){
           this.database.getBankAccount(accountId).setAccountBalance(newBalance);
           return this.database.getBankAccount(accountId).getAccountBalance();
    }

	@Override
	public Double getBalance11(Long accountId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getBalance1(Long accountId) {
		// TODO Auto-generated method stub
		return null;
	}


}