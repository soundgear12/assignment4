package com.meritamerica.assignment4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class MeritBank {
	
	String path = "src/main/java/data.txt";
	
	static void addAccountHolder(AccountHolder accountHolder) {
		AccountHolder[] temp = Arrays.copyOf(getAccountHolders(), accountHolders.length + 1);
		temp[temp.length - 1] = accountHolder;
		accountHolders = temp;
	}

	static AccountHolder[] accountHolders;

	static AccountHolder[] getAccountHolders() {
		return accountHolders;
	}
	
	public static AccountHolder[]  sortAccountHolders() {
		Arrays.sort(accountHolders);
		return accountHolders;
	}


	public static boolean readFromFile(String path) {
		BufferedReader br = null;
		CDOffering[] cdOfferings = null;
		String line; 
		
		
			try {
				
				br = new BufferedReader(new FileReader(path));
				while ((line = br.readLine())!= null) {
					long nextacn = Long.parseLong(line);
					String numCDs = br.readLine();
					int numofCDOfferings = Integer.parseInt(numCDs);
					cdOfferings = new CDOffering[numofCDOfferings];
						for (int i = 0; i < numofCDOfferings; i++) {
							CDOffering cDO = CDOffering.readFromString(br.readLine());
							if (cDO != null)
									cdOfferings[i] = cDO;
							
						}
					System.out.println("Next account Number: " + nextacn);
					System.out.println("Number of CD Offerings " + cdOfferings.length);
					System.out.println(Arrays.asList(cdOfferings).toString());
					int numAccHolders = Integer.parseInt(br.readLine());
					AccountHolder[] achs = new AccountHolder[numAccHolders];
					for (int i = 0; i < numAccHolders; i++) {
						AccountHolder ach = AccountHolder.readFromString(br.readLine());
						int numCheckingAccounts = Integer.parseInt(br.readLine());
						
							if (ach != null)
								achs[i] = ach;
							for (int j = 0; j < numCheckingAccounts; j++) {
								ach.addCheckingAccount(CheckingAccount.readFromString(br.readLine()));
								
							}
						int numCheckingTransaction = Integer.parseInt(br.readLine());
						
						int numSavingsAccounts = Integer.parseInt(br.readLine());
							
							if (ach != null)
								achs[i] = ach;
							for (int j = 0; j < numSavingsAccounts; j++) {
								ach.addSavingsAccount(SavingsAccount.readFromString(br.readLine()));
							}
						int numCDAccounts = Integer.parseInt(br.readLine());
							
							if (ach != null)
								achs[i] = ach;
							for (int j = 0; j < numCDAccounts; j++) {
								ach.addCDAccount(CDAccount.readFromString(br.readLine()));
							}
							System.out.println (Arrays.asList(achs).toString());
							System.out.println (Arrays.asList((achs[i].getCheckingAccounts())).toString());
							System.out.println (Arrays.asList((achs[i].getSavingsAccounts())).toString());
							System.out.println (Arrays.asList((achs[i].getCDAccounts())).toString());
							
					}
					break;
				}
				
				
				br.close();
			} catch (FileNotFoundException fileNotFound) {
				fileNotFound.printStackTrace();
				
			} catch (IOException ioe) {
				System.out.print("Exception caught");
				ioe.printStackTrace();
				
			} catch (Exception e) {
				System.out.println("Exception caught");
				e.printStackTrace();	
			} finally {
				System.out.println("Reached FInally Block");
			}
			
				boolean result = true;
				return result;
			} 	
		
	
	private static CDOffering[] cdOfferings;

	public static CDOffering[] getCDOfferings() {
		
		return cdOfferings;
	}
	
	public static void setCDOfferings(CDOffering[] cdOfferings) {
		MeritBank.cdOfferings = cdOfferings;
	}
	
	public static void clearCDOfferings() {
		cdOfferings = null;
	}
	
	static CDOffering getBestCDOffering(double depositAmount) {
		double bestIR = -1;
		CDOffering bestCDO = null;
		for (int i = 0; i < cdOfferings.length; i++) {
			CDOffering cdo = cdOfferings[i];
			double interestRate = cdo.getInterestRate();
			if (interestRate > bestIR) {
				bestIR = interestRate;
				bestCDO = cdo;
			}
		}
		return bestCDO;
	}
	static CDOffering getSecondBestCDOffering(double depositAmount) {
		double bestIR = -1;
		CDOffering secondCDO = null; 
		CDOffering bestCDO = null;
		for (int i = 0; i < cdOfferings.length; i++) {
			CDOffering cdo = cdOfferings[i];
			double interestRate = cdo.getInterestRate();
			if (interestRate > bestIR) {
				bestIR = interestRate;
				secondCDO = bestCDO;
				bestCDO = cdo;
			}
		}
		return secondCDO;
	}

	
	public static void main(String[] args) {
		
	}
	
	static void setNextAccountNumber(long nextAccountNumber) {
		nextAccountNumber = accountNumber;
	}
	static long getNextAccountNumber() {
		accountNumber++;
		return accountNumber;
	}
	static long accountNumber;
	
	public double getTotalBalances() {
		double total = 0;
		for (AccountHolder a : accountHolders) {
			total += a.getCombinedBalance();
		}
		
		return total;
	}
	
	static double totalBalances() {
		double CombinedBalance = 0;
		for (int i = 0; i < accountHolders.length; i++) {
			AccountHolder accHolder = accountHolders[i];
			CombinedBalance = CombinedBalance + accHolder.getCombinedBalance();
		}
		return CombinedBalance;
	}
	static double futureValue(double presentValue, double interestRate, int term) {
			double factor = 1+interestRate;
			return Math.pow(factor, term) * presentValue;
	}
	
	public static boolean processTransaction(Transaction transaction) throws NegativeAmountException, ExceedsAvailableBalanceException, ExceedsFraudSuspicionLimitException {
		if (Transaction) {
			if (transaction.amount > 0 && transaction.amount < 1000) {
				
			}
		}	
		
		return false;
	}

	
}