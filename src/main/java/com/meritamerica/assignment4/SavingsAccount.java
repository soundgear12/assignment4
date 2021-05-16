package com.meritamerica.assignment4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SavingsAccount extends BankAccount {

	public SavingsAccount(double balance) {
		super(balance, 0.01);
	}
	
	public SavingsAccount (double balance, double interestRate) {
		super(balance, interestRate);
	}

	public SavingsAccount (double balance, double interestRate, Date accountOpenedOn) {
		super(balance, interestRate, accountOpenedOn);
	}	
		
	public SavingsAccount(long acn, double bal, double intRate, Date date) {
		super(acn, bal, intRate, date);
	
	}
	
	public static SavingsAccount readFromString(String accountData) {
			
			long acn = 0;
			double bal = 0;
			double intRate = 0;
			SimpleDateFormat dateFormat = new SimpleDateFormat("01/01/2020");
			Date aDate = null;
			try {
					String [] dataSplit = accountData.split(",");
					acn = Long.parseLong(dataSplit[0]);
					bal = Double.parseDouble(dataSplit[1]);
					intRate = Double.parseDouble(dataSplit[2]);
					aDate = dateFormat.parse("01/01/2020");
			}	catch (Exception e) {
				e.printStackTrace();
				
			}
			return new SavingsAccount(acn, bal, intRate, aDate);
		}

	@Override
	public String toString() {
		return "SavingsAccount [accountNumber=" + accountNumber + ", balance=" + balance + ", interestRate="
				+ interestRate + ", accountOpenedOn=" + accountOpenedOn + "]";
	}


}