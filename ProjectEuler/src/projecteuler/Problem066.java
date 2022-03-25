package projecteuler;

import java.math.BigInteger;

public class Problem066 {

	public static void main(String[] args) {
		int ans = 0;
		BigInteger max = new BigInteger("0");
		for (int D = 1; D <= 1000; D++) {
			if (Functions.isInteger(Math.sqrt(D))) {
				continue;
			}
			int m = 0;
			int d = 1;
			int a = (int)Math.floor(Math.sqrt(D));
			BigInteger a_init = new BigInteger("1");
			BigInteger b_init = new BigInteger("0");
			BigInteger a0 = new BigInteger(String.valueOf(a));
			BigInteger b0 = new BigInteger("1");
			BigInteger num, den;
			while(true) {
				int m1 = a*d-m;
				int d1 = (D-m1*m1)/d;
				int a1 = (int)Math.floor((Math.sqrt(D)+m1)/d1);
				
				num = a0.multiply(new BigInteger(String.valueOf(a1))).add(a_init);
				den = b0.multiply(new BigInteger(String.valueOf(a1))).add(b_init);
				
				if (num.multiply(num).subtract(den.multiply(den).multiply(new BigInteger(String.valueOf(D)))).intValue() == 1) {	
					if (num.max(max) == num) {
						max = num;
						ans = D;
					}
					break;
				}
				
				m = m1;
				d = d1;
				a = a1;
				a_init = a0;
				b_init = b0;
				a0 = num;
				b0 = den;
			}
		}
		System.out.println(ans);
	}	
}
