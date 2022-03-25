package projecteuler;


import java.math.BigInteger;

public class Problem055 {

	public static void main(String[] args) {
		int ans = 0;
		for (int n = 1; n <= 10000; n++) {
			int count = 0;
			BigInteger k = new BigInteger(String.valueOf(n));
			while (true) {
				BigInteger reverse = new BigInteger(new StringBuilder(String.valueOf(k)).reverse().toString());
				k = k.add(reverse);
				count++;
				if (count == 50) {
					ans++;
					break;
				} else if (Functions.isPalindrome(k)) {
					break;
				}
			}
		}
		System.out.println(ans);
	}
}