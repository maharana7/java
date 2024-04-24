package com.nit.bank;

public class Bank {

	private String bankName;
	private String bankCustomerName;
	private String bankAddress;
	private String bankIFSCCode;
	private int customerAccountNumber;
	private int currentBalance;

	public void setDetails(String bankName, String bankCustomerName, String bankAddress, String bankIFSCCode,
			int customerAccountNumber, int currentBalance) {
		this.bankName = bankName;
		this.bankCustomerName = bankCustomerName;
		this.bankAddress = bankAddress;
		this.bankIFSCCode = bankIFSCCode;
		this.customerAccountNumber = customerAccountNumber;
		this.currentBalance = currentBalance;
	}

	public void withdraw(double amount) {
		if (currentBalance < 1000)
			System.out.println("Insufficient Balance");
		else if (currentBalance - amount < 1000) {
			System.out.println("Maintain Minimum Balance");
		} else {
			currentBalance -= amount;
			System.out.println("Transaction Successful");
			currentBalance();
		}
	}

	public void deposit(double amount) {
		if (currentBalance + amount < 1000)
			System.out.println("Maintain Minimum Balance");
		else {
			currentBalance += amount;
			System.out.println("Deposited Successfully");
			currentBalance();
		}
	}

	public void currentBalance() {
		System.out.println("Availabel Balance: " + currentBalance);
	}

	public String displayDetails() {
		return toString();
	}

	public String toString() {
		return "\nBank Name: " + bankName + "\nCustomer Name: " + bankCustomerName + "\nAddress: " + bankAddress
				+ "\nIFSC Code: " + bankIFSCCode + "\nAccount Number: " + customerAccountNumber + "\nCurrent Balance: "
				+ currentBalance;
	}

}
