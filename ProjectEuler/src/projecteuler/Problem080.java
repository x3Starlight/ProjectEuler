package projecteuler;


import java.math.BigInteger;

public class Problem080 {

	public static void main(String[] args) {
		int ans = 0;
		for (int n = 1; n <= 100; n++) {
			if (Functions.isInteger(Math.sqrt(n))) {
				continue;
			}
			BigInteger num = Functions.getSquareRootDigits(n, 100);
			ans += Functions.getSumOfDigits(num.toString());
		}
		System.out.println(ans);
	}
}
