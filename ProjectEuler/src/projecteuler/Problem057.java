package projecteuler;

import java.math.BigInteger;

public class Problem057 {

	public static void main(String[] args) {
		int count = 0;
		BigInteger num = new BigInteger("3");
		BigInteger den = new BigInteger("2");
		for (long n = 2; n <= 1000; n++) {
			BigInteger num_t = num.add(den).add(den);
			BigInteger den_t = num.add(den);
			num = num_t;
			den = den_t;
			if (String.valueOf(num).length() > String.valueOf(den).length()) {
				count++;
			}
		}
		System.out.println(count);
	}
}
