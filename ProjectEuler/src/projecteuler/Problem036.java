package projecteuler;

import java.math.BigInteger;

public class Problem036 {

	public static void main(String[] args) {
		long ans = 0;
		for (int i = 1; i < 1000000; i++) {
			if (!Functions.isPalindrome(i)) {
				continue;
			}
			String binary = new BigInteger(String.valueOf(i)).toString(2);
			if (Functions.isPalindrome(binary)) {
				ans += i;
			}
		}
		System.out.println(ans);
	}
}
