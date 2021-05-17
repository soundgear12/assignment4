package com.meritamerica.assignment4;

public class FraudQueue {
	private Transaction transaction;
	
	public FraudQueue () {
		
	}
	
	
	
	public void addTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
	
	public Transaction getTransaction() {
		return this.transaction;
	}
}
