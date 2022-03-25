package projecteuler;

import java.math.BigInteger;

public class Problem016 {

	public static void main(String[] args) {
		int ans = 0;
		BigInteger num = new BigInteger("2");
		String digits = num.pow(1000).toString();
		ans = Functions.getSumOfDigits(digits);
		System.out.println(ans);
	}

}
