package com.nit.bankaccount;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter bank branch: ");
		String branchName = sc.nextLine();

		System.out.print("Enter account number: ");
		long acno = sc.nextLong();

		sc.nextLine();
		System.out.print("Enter holder name: ");
		String holderName = sc.nextLine();

		System.out.print("Enter the balance: ");
		double balance = sc.nextDouble();

		BankAccount account1 = new BankAccount(branchName, acno, holderName, balance);

		System.out.print(
				"\nOptions: \n1 - Deposit Money\n2 - Withdraw Money\n3 - Check Balance\n4 - Exit\nChoose Your Option: ");
		char ch = sc.next().charAt(0);
		sc.nextLine();

		System.out.println();
		switch (ch) {
		case '1':
			System.out.print("Amount to deposit: ");
			double depositAmount = sc.nextDouble();
			account1.depositMoney(depositAmount);
			break;
		case '2':
			System.out.print("Amount to withdraw: ");
			double withdrawAmount = sc.nextDouble();
			account1.withdrawMoney(withdrawAmount);
			break;
		case '3':
			account1.checkBalance();
			break;
		case '4':
			System.out.print("Exited the program.");
			break;
		default:
			System.out.print("Choose a valid option.");
			break;
		}

		sc.close();

	}

}
