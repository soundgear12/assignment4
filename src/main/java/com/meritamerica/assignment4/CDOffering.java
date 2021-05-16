package com.meritamerica.assignment4;



public class CDOffering {
	private int term;
	private double interestRate;
	
	
	public CDOffering(int term, double interestRate) {
		this.term = term;
		this.interestRate = interestRate;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public int getTerm() {
		return term;
	}

	public void setTerm(int term) {
		this.term = term;
	}

	public static void setCDOfferings(CDOffering[] offerings) {
		
	}
	

	public static CDOffering getBestCDOffering(double depositAmount) {
		return null;
	}
	
	public static CDOffering getSecondBestCDOffering(double depositAmount) {
		return null;
	}

	public static CDOffering readFromString(String accountData) {
			
			
			int year = 0;
			double intRate = 0;
			
			try {
					String [] dataSplit = accountData.split(",");
					
					year = Integer.parseInt(dataSplit[0]);
					intRate = Double.parseDouble(dataSplit[1]);
			}	catch (Exception e) {
				e.printStackTrace();
	
			}
			return new CDOffering(year, intRate);
	}
	
	@Override
	public String toString() {
		return "CDOffering [term=" + term + ", interestRate=" + interestRate + "]";
	}

}
