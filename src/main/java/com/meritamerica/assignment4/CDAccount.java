package com.meritamerica.assignment4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CDAccount extends BankAccount {

	private CDOffering cdoffering;
	private int term;

	public CDAccount(CDOffering cdoffering, double balance) {
		super(cdoffering.getInterestRate(), balance);
		this.term = cdoffering.getTerm();
	}
	
	public CDAccount(long acn, double bal, double intRate, Date date) {
		super(acn, bal, intRate, date);
	
	}
	
	public CDAccount(long acn, double bal, double intRate, Date date, int term) {
		super(acn, bal, intRate, date);

	}
	
	
	public static CDAccount readFromString(String accountData) {
			
			
			int acn = 0;
			double bal = 0;
			double intRate = 0;
			SimpleDateFormat dateFormat = new SimpleDateFormat("01/01/2020");
			Date aDate = null;
			int year = 0;
			
			try {
					String [] dataSplit = accountData.split(",");
					
					acn = Integer.parseInt(dataSplit[0]);
					bal = Double.parseDouble(dataSplit[1]);
					intRate = Double.parseDouble(dataSplit[2]);
					aDate = dateFormat.parse(dataSplit[3]);
					year = Integer.parseInt(dataSplit[4]);
					
			}	catch (Exception e) {
				e.printStackTrace();
	
			}
			return new CDAccount(acn, bal, intRate, aDate, year);
	}

	@Override
	public String toString() {
		return "CDAccount [accountNumber=" + accountNumber + ", balance=" + balance
				+ ", interestRate=" + interestRate + ", accountOpenedOn=" + accountOpenedOn + ", term= " + term + "]";
	}

	public int getTerm() {
		return term;
	}

	public double futureValue() {
		// TODO Auto-generated method stub
		return 0;
	}		
}