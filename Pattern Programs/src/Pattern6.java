
public class Pattern6 {

	public static void main(String[] args) {
		
		int n= 5;
		
		for(int i = 1; i <= n; i++) {
			for(int s = 0; s <= n-i; s++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		n--;
		for(int i = n; i >= 1; i--) {
			for(int s = 1; s <= n-i; s++) {
				System.out.print(" ");
			}
			for(int j = n; j >= 1; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
