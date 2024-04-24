package com.nit.bankaccount;

public class BankAccount {

	String branchName;
	long accountNumber;
	String holderName;
	double balance;

	BankAccount(String branchName, long accountNumber, String holderName, double balance) {
		this.branchName = branchName;
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
	}

	void depositMoney(double amount) {
		balance += amount;
		System.out.println("\nAmount Deposited: " + amount);
		checkBalance();
	}

	void withdrawMoney(double amount) {
		if (amount > balance)
			System.out.println("\nWithdrawl amount must be less than availabe balance.");
		else
			balance -= amount;
		System.out.println("\nAmount Withdrawn: " + amount);
		checkBalance();
	}

	void checkBalance() {
		System.out.println("\nAvailable Balance: " + balance);
	}

}
