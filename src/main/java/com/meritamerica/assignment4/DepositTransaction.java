package com.meritamerica.assignment4;

import java.util.Date;

public class DepositTransaction extends Transaction {

	
	
	private DepositTransaction(BankAccount sourceAccount, BankAccount targetAccount, double amount, Date accountOpenedOn) {
		super(sourceAccount, targetAccount, amount, accountOpenedOn);	
		}
	

	public DepositTransaction(BankAccount targetAccount, double amount) {
		super(targetAccount, amount);
	}


	@Override
	public void process()
			throws NegativeAmountException, ExceedsAvailableBalanceException, ExceedsFraudSuspicionLimitException {
		// TODO Auto-generated method stub
		
	}

	
}
