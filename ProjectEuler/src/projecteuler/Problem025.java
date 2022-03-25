package projecteuler;

import java.math.BigInteger;

public class Problem025 {

	public static void main(String[] args) {
		BigInteger f1 = new BigInteger("1");
		BigInteger f2 = new BigInteger("1");
		BigInteger f3;
		int count = 2;
		while(true) {
			f3 = f2.add(f1);
			count++;
			if (f3.toString().length() >= 1000) {
				break;
			}
			f1 = new BigInteger(f2.toString());
			f2 = new BigInteger(f3.toString());
		};
		System.out.println(count);
	}
}
