package com.meritamerica.assignment4;

import java.util.ArrayList;
import java.util.Date;

public class DepositTransaction extends Transaction {

	ArrayList<Transaction> depositTransaction = new ArrayList<Transaction>();
	
	private DepositTransaction(BankAccount sourceAccount, BankAccount targetAccount, double amount, Date accountOpenedOn) {
		super(sourceAccount, targetAccount, amount, accountOpenedOn);	
		}
	

	public DepositTransaction(BankAccount targetAccount, double amount) {
		super(targetAccount, amount);
	}


	@Override
	public void process()
			throws NegativeAmountException, ExceedsAvailableBalanceException, ExceedsFraudSuspicionLimitException {
		if (amount < 0) {
			throw new NegativeAmountException("Negative Amount Not allowed" + amount);
		}
		targetAccount.balance += amount;
	}


}
