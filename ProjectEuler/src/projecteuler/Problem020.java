package projecteuler;

import java.math.BigInteger;

public class Problem020 {

	public static void main(String args[]) {
		int ans = 0;
		BigInteger num = new BigInteger("1");
		for (int n = 1; n <= 100; n++) {
			num = num.multiply(new BigInteger(String.valueOf(n)));
			BigInteger base10 = new BigInteger("10");
			while (num.mod(base10) == BigInteger.ZERO) {
				num = num.divide(base10);
			}
		}
		ans = Functions.getSumOfDigits(num.toString());
		System.out.println(ans);
	}
}
