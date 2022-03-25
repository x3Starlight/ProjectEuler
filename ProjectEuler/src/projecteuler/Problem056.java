package projecteuler;


import java.math.BigInteger;

public class Problem056 {

	public static void main(String args[]) {
		int ans = 0;
		for (int a = 1; a < 100; a++) {
			for (int b = 1; b < 100; b++) {
				BigInteger n = new BigInteger(String.valueOf(a)).pow(b);
				int sum = Functions.getSumOfDigits(n.toString());
				if (sum > ans) {
					ans = sum;
				}
			}
		}
		System.out.println(ans);
	}
}
