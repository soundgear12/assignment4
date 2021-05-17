package com.meritamerica.assignment4;

import java.util.List;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public abstract class BankAccount {
	private static char[] dataSplit;
	protected long accountNumber;
	protected double balance;
	protected double interestRate;
	Date accountOpenedOn;
	List<Transaction> transaction = new ArrayList<>();
	DepositTransaction depositTransaction = null;
	WithdrawTransaction withdrawTransaction = null;
	TransferTransaction transferTransaction = null;
	
	
	BankAccount (double balance, double interestRate){
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	BankAccount(double balance, double interestRate, Date accountOpenedOn) {
		this.balance = balance;
		this.interestRate = interestRate;
		this.accountOpenedOn = accountOpenedOn;
	}
	
	BankAccount(long accountNumber, double balance, double interestRate, Date accountOpenedOn) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.interestRate = interestRate;
		this.accountOpenedOn = accountOpenedOn;
	}
	
	
	public Date getOpenedOn() {
		return accountOpenedOn;
	}
	
	public void addTransaction(Transaction transaction) {
		this.transaction.add(transaction);
	}
	

	


	public List<Transaction> getTransactions() {
		return null;
	}
	
	
/*	public static BankAccount readFromString(String accountData) {
		
		long acn = 0;
		double bal = 0;
		double intRate = 0;
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
		try {
				String [] dataSplit = accountData.split(",");
				acn = Long.parseLong(dataSplit[0]);
				bal = Double.parseDouble(dataSplit[1]);
				intRate = Double.parseDouble(dataSplit[2]);
				Date aDate = dateFormat.parse("01/01/2020");
		}	catch (Exception e) {
			e.printStackTrace();
		}
		return new BankAccount(acn, bal, intRate, date);
	}	
*/	
	public static void main(String[] args) {
	 
	}


	long getAccountNumber() {
		return accountNumber;
	}
	double getBalance() {
		return balance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public boolean withdraw(double amount) {
		if (amount<balance) {
			System.out.println(balance-amount);
			balance = balance - amount;
			return true;
		} else return false;
	}
	public boolean deposit(double amount) {
		if (amount>0) {
			System.out.println(balance+amount);
			balance = balance+amount;
			return true;
		}else return false;
	}
	public double futureValue(int years) {
			double factor = 1+interestRate;
			return Math.pow(factor, years) * balance;
	}
	}