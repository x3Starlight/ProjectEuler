package projecteuler;

import java.math.BigInteger;

public class Problem053 {

	public static void main(String[] args) {
		int count = 0;
		for (int n = 1; n <= 100; n++) {
			for (int r = 1; r <= n; r++) {
				BigInteger c = Functions.getFactorial(n).divide(Functions.getFactorial(r)).divide(Functions.getFactorial(n-r));
				if (c.compareTo(new BigInteger("1000000")) == 1) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
