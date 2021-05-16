package com.meritamerica.assignment4;

import java.util.Date;

public class TransferTransaction extends Transaction {

	@Override
	public void process()
			throws NegativeAmountException, ExceedsAvailableBalanceException, ExceedsFraudSuspicionLimitException {
		// TODO Auto-generated method stub
		
	}
	

	
	private TransferTransaction(BankAccount sourceAccount, BankAccount targetAccount, double amount, Date accountOpenedOn) {
		super(sourceAccount, targetAccount, amount, accountOpenedOn);	
		}
	
	TransferTransaction(BankAccount sourceAccount, BankAccount targetAccount, double amount) {
		super(sourceAccount, targetAccount, amount);
	}

}
