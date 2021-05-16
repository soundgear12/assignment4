package com.meritamerica.assignment4;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class CheckingAccount extends BankAccount {
	
	
	
	public CheckingAccount(double balance) {
		super(balance, 0.0001);
	}
	
	public CheckingAccount (double balance, double interestRate) {
		super(balance, interestRate);
	}

	public CheckingAccount (double balance, double interestRate, Date accountOpenedOn) {
		super(balance, interestRate, accountOpenedOn);
	}	
		
	public CheckingAccount(long acn, double bal, double intRate, Date accountOpenedon) {
		super(acn, bal, intRate, accountOpenedon);
	
	}


	

public static CheckingAccount readFromString(String checkingAccountData) {
		
		long acn = 0;
		double bal = 0;
		double intRate = 0;
		SimpleDateFormat dateFormat = new SimpleDateFormat("01/01/2020");
		Date adate = null;
		try {
				String [] dataSplit = checkingAccountData.split(",");
				acn = Long.parseLong(dataSplit[0]);
				bal = Double.parseDouble(dataSplit[1]);
				intRate = Double.parseDouble(dataSplit[2]);
				adate = dateFormat.parse(dataSplit[3]);
		}	catch (Exception e) {
			e.printStackTrace();
			
		}
		return new CheckingAccount(acn, bal, intRate, adate);
	}

@Override
public String toString() {
	return "CheckingAccount [accountNumber=" + accountNumber + ", balance=" + balance + ", interestRate=" + interestRate
			+ ", accountOpenedOn=" + accountOpenedOn + "]";
}	
	
	
}