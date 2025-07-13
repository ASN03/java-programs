package com.elemica.assignment.four;

public class SavingsAccount extends BankAccount{
	
	public SavingsAccount(String accId, String accName, int amount) {
		super(accId, accName, amount);
	}

	public void getAccountDetails() {
		System.out.println("Savings Account Details:");
		System.out.println("Account ID:" + this.getAccountId());
		System.out.println("Account Name: " + this.getAccountName());
		System.out.println("Amount: " + this.getAmount());
	}
}
