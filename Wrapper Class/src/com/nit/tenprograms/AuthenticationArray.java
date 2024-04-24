package com.nit.tenprograms;

import java.util.Scanner;

public class AuthenticationArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] usernames = { "username1", "username2", "username3" };
		String[] passwords = { "password1", "password2", "password3" };

		System.out.print("Enter the username: ");
		String uname = sc.next();
		System.out.print("Enter the password: ");
		String pwd = sc.next();

		Boolean res = authenticate(uname, pwd, usernames, passwords);

		if (res)
			System.out.println("Authentication Successful");
		else
			System.out.println("Authentication Failed");
		
		sc.close();

	}

	private static Boolean authenticate(String uname, String pwd, String usernames[], String passwords[]) {

		for (int i = 0; i < usernames.length; i++) {
			if (usernames[i].equals(uname) && passwords[i].equals(pwd)) {
				return true;
			}
		}
		return false;

	}

}