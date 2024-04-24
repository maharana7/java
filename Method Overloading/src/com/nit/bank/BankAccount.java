package com.nit.bank;

import java.util.Scanner;

public class BankAccount {

	String accountNumber;
	double balance;

	public BankAccount(String accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		System.out.println("Transaction Successful");
		balance += amount;
		checkBalance();
	}

	public void withdraw(double amount) {
		if (balance > amount) {
			balance -= amount;
			System.out.println("Transaction Successful");
			checkBalance();
		} else {
			System.out.println("Insufficient Balance");
		}
	}

	public void checkBalance() {
		System.out.println("Available Balance: " + balance);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter bank Account Number: ");
		String acno = sc.next();
		
		System.out.println("Balance: ");
		double balance = sc.nextDouble();

		BankAccount b1 = new BankAccount(acno, balance);

		System.out.println("\nChoose option\n1-Deposit\n2-Withdraw\n3-Check Balance");
		char ch = sc.next().charAt(0);

		switch (ch) {
		case '1':
			System.out.print("Deposit amount: ");
			double amount = sc.nextDouble();
			b1.deposit(amount); break;
		case '2':
			System.out.print("Withdraw amount: ");
			double wAmount = sc.nextDouble();
			b1.withdraw(wAmount); break;
		case '3': b1.checkBalance(); break;
		}

	}

}
