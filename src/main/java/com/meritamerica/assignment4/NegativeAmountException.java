package com.meritamerica.assignment4;

public class NegativeAmountException extends Exception {
	
	public NegativeAmountException() {
		super();
	}
	
	public NegativeAmountException(String reason) {
		 super(reason);
	}
}
