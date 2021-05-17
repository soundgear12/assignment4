package com.meritamerica.assignment4;

public class ExceedsFraudSuspicionLimitException  extends Exception {
	
	public ExceedsFraudSuspicionLimitException(String reason) {
		super(reason);
	}	
}
