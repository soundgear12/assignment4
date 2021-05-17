package com.meritamerica.assignment4;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Transaction {
	
	public Transaction(BankAccount sourceAccount, BankAccount targetAccount, double amount, Date accountOpenedOn) {
		super();
		this.sourceAccount = sourceAccount;
		this.targetAccount = targetAccount;
		this.amount = amount;
		this.accountOpenedOn = accountOpenedOn;
	}
	
	public Transaction(BankAccount sourceAccount, BankAccount targetAccount, double amount) {
		super();
		this.sourceAccount = sourceAccount;
		this.targetAccount = targetAccount;
		this.amount = amount;
	}

	public Transaction(BankAccount targetAccount, double amount) {
		super();
		this.targetAccount = targetAccount;
		this.amount = amount;
	}

	BankAccount sourceAccount;
	BankAccount targetAccount;
	double amount;
	Date accountOpenedOn;
	
	SimpleDateFormat formatter = new SimpleDateFormat ("dd/MM/yyyy");
	
	Date date = new Date();
	private String reason;
	
	
	

	
	public BankAccount getSourceAccount() {
		return sourceAccount;
	}
	
	public void setSourceAccount(BankAccount sourceAccount) {
		this.sourceAccount = sourceAccount;	
		}
	
	
	public BankAccount getTargetAccount() {
		return targetAccount;
	}
	
	public void setTargetAccount(BankAccount targetAccount) {
		this.targetAccount = targetAccount;
	}
	
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public java.util.Date getTransactionDate() {
		return getTransactionDate();
	}

	public void setTransactionDate(java.util.Date date) {
		
	}

	public String writeToString() {
		return null;
		
	}

	public static Transaction readFromString(String transactionDataString) {
		return null;
		
	}
	
	public abstract void process() throws NegativeAmountException, ExceedsAvailableBalanceException, ExceedsFraudSuspicionLimitException;	
		
	
	
	
	public boolean isProcessedByFraudTeam() {
		return false;
		
	}
		
	
		
	public void setProcessedByFraudTeam(boolean isProcessed) {
		
	}
	
	public String getRejectionReason() {
		return reason;
		
	}
	
	public void setRejectionReason(String reason) {
		this.reason = reason;
	}

	

	
}
