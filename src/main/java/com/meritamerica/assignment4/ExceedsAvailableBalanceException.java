package com.meritamerica.assignment4;

public class ExceedsAvailableBalanceException  extends Exception {
		
	public ExceedsAvailableBalanceException(String reason) {
			super(reason);
	}	
}
