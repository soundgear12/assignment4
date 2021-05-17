package com.meritamerica.assignment4;

import java.util.Date;

public class TransferTransaction extends Transaction {

	@Override
	public void process()
			throws NegativeAmountException, ExceedsAvailableBalanceException, ExceedsFraudSuspicionLimitException {
		if (amount > targetAccount.balance) {
			throw new ExceedsAvailableBalanceException("Withdrawal amount exceeds balance");
		} else if (amount > 1000) {
			throw new ExceedsFraudSuspicionLimitException("Transfer amount exceeds suspicion limit");
			FraudQueue.addTransaction();
		}
		sourceAccount.balance -=  this.amount;
		targetAccount.balance += this.amount;
		
	}
	

	
	private TransferTransaction(BankAccount sourceAccount, BankAccount targetAccount, double amount, Date accountOpenedOn) {
		super(sourceAccount, targetAccount, amount, accountOpenedOn);	
		}
	
	TransferTransaction(BankAccount sourceAccount, BankAccount targetAccount, double amount) {
		super(sourceAccount, targetAccount, amount);
	}

}
