package com.java.bank;
public class SavingsAccount {
	
		private int accountNumber;
		private String accountHolder;
		private double accountBalance;
		
		
		public void withdraw(double amtToWithdraw) {
			System.out.println("Withdrawing..."+amtToWithdraw);
			accountBalance = accountBalance - amtToWithdraw;
			//accountBalance = accountBalance-1;
		}
		
		
		public SavingsAccount(int accountNumber, String accountHolder, double accountBalance) {
			super();
			this.accountNumber = accountNumber;
			this.accountHolder = accountHolder;
			this.accountBalance = accountBalance;
		}
		public int getAccountNumber() {
			return accountNumber;
		}
		public void setAccountNumber(int accountNumber) {
			this.accountNumber = accountNumber;
		}
		public String getAccountHolder() {
			return accountHolder;
		}
		public void setAccountHolder(String accountHolder) {
			this.accountHolder = accountHolder;
		}
		public double getAccountBalance() {
			return accountBalance;
		}
		public void setAccountBalance(double accountBalance) {
			this.accountBalance = accountBalance;
		}	
	
}
