package com.meritamerica.assignment4;

import java.util.Date;

public class WithdrawTransaction extends Transaction {

	@Override
	public void process()
			throws NegativeAmountException, ExceedsAvailableBalanceException, ExceedsFraudSuspicionLimitException {
		if (amount > targetAccount.balance) {
			throw new ExceedsAvailableBalanceException("Withdrawal amount exceeds balance");
		}
		
		targetAccount.balance = targetAccount.balance - amount;
	}
	
	private WithdrawTransaction(BankAccount sourceAccount, BankAccount targetAccount, double amount, Date accountOpenedOn) {
		super(sourceAccount, targetAccount, amount, accountOpenedOn);	
		}
	
	public WithdrawTransaction(BankAccount targetAccount, double amount) {
		super(targetAccount, amount);
	}

}
