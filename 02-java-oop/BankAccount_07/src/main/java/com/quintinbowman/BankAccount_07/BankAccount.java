package com.quintinbowman.BankAccount_07;

import java.util.Random;

public class BankAccount {

	private static int numberOfAccounts = 0;
	private static String accountNumber;
	private static Double checkingBalance = 0.0;
	private static Double savingBalance = 0.0;
	private static Double total = checkingBalance + savingBalance; 
	
	public static void main(String[] args) {
		
	}
	
	public static void accountBalance() {
		System.out.printf("You currently have " +total, " deposited in your accounts.");
		System.out.printf("You currently have " +checkingBalance, "in your Checking Account.");
		System.out.printf("You currently have " +savingBalance, "in your Savings Account.");
	}
	
	private static String createAccountNum() {
		Random r = new Random();
		String accountNumber = "";
		for(int a = 0; a < 10; a++) {
			accountNumber += r.nextInt(10);
		}
		return accountNumber;
	}
	
	public BankAccount() {
		BankAccount.numberOfAccounts += 1;
		this.checkingBalance = 0.0;
		this.savingBalance = 0.0;
		this.accountNumber = BankAccount.createAccountNum();
	}
	
	public void depositMoney(Double amount, String account){
		if (account.equalsIgnoreCase("Checking")) {
			this.checkingBalance += amount;
		}
		else if (account.equalsIgnoreCase("Saving")) {
			this.savingBalance += amount;
		}
		else {
			System.out.print("If you have an account with us, please select which account you would"
					+ "to deposit into.");
		}
		System.out.printf("You now have " +total, "deposit in your accounts.");
	}

	public void withdrawMoney(Double amount, String account){
		if (account.equalsIgnoreCase("Checking")) {
			if (checkingBalance > 0.0) {
			this.checkingBalance -= amount;
			}
			else {
				System.out.print("Insufficient Funds. Please deposit more funds before taking that action.");
			}
		}
		else if (account.equalsIgnoreCase("Saving")) {
			if (savingBalance > 0.0) {
			this.savingBalance -= amount;
			}
			else {
				System.out.print("Insufficient Funds. Please deposit more funds before taking that action.");
			}
		}
		else {
			System.out.print("If you have an account with us, please select which account you would"
					+ "to deposit into.");
		}
		System.out.printf("You now have " +total, "deposit in your accounts.");
	}

	public Double getCheckingBalance() {
		return checkingBalance;
	}

	public void setCheckingBalance(Double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}

	public Double getSavingBalance() {
		return savingBalance;
	}

	public void setSavingBalance(Double savingBalance) {
		this.savingBalance = savingBalance;
	}
	
}
