import java.util.Scanner;

public class AbundantNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		checkAbundant(n);

		sc.close();
	}
	
	static void checkAbundant(int n) {
		int sum = 0;
		for(int i = 1; i <= n/2; i++) {
			if(n%i == 0) sum += i;
		}
		
		if(sum > n) {
			System.out.println("Abundant Number");
			checkPalindrome(n);
		}
		else System.out.println("Not Abundant Number");
	}
	
	static void checkPalindrome(int n) {
		int revNum = 0, temp = n;
		while(temp != 0) {
			revNum += temp % 10;
			temp /= 10;
		}
		if(revNum == n) System.out.println("Palindrome Number");
		else System.out.println("Not Palindrome Number");
	}

}
