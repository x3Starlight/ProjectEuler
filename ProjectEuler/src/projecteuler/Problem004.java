package projecteuler;

public class Problem004 {

	
	public static void main(String args[]) {
		int ans = 0;
		for (int i = 901; i < 1000; i++) {
			for (int j = i; j < 1000; j++) {
				int prod = i * j;
				if ((Functions.isPalindrome(prod)) && prod > ans) {
					ans = prod;
				}
			}
		}
		System.out.println(ans);
	}
}
