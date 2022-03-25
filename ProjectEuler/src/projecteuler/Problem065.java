package projecteuler;


import java.math.BigInteger;

public class Problem065 {

	public static void main(String[] args) {
		BigInteger a_init = new BigInteger("1");
		BigInteger b_init = new BigInteger("0");
		BigInteger a0 = new BigInteger("2");
		BigInteger b0 = new BigInteger("1");
		for (long n = 2; n <= 100; n++) {
			long _n = n-1;
			long k = 0;
			BigInteger a;
			BigInteger b;
			if (_n % 3 == 2) {
				k = (n+1)/3*2;
			} else {
				k = 1;
			}
			a = a0.multiply(new BigInteger(String.valueOf(k))).add(a_init);
			b = b0.multiply(new BigInteger(String.valueOf(k))).add(b_init);
			
			if (n == 100) {
				System.out.print(Functions.getSumOfDigits(String.valueOf(a)));
			}
			
			a_init = a0;
			b_init = b0;
			a0 = a;
			b0 = b;
		}
	}
}
