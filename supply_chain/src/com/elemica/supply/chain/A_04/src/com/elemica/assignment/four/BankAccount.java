package com.elemica.assignment.four;

public abstract class BankAccount {
	private String accountId;
	private String accountName;
	private int amount;
	
	
	public BankAccount(String accountId, String accountName, int amount) {
		this.accountId = accountId;
		this.accountName = accountName;
		this.amount = amount;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public abstract void getAccountDetails();
}
