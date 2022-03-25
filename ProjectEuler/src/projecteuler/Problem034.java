package projecteuler;

import java.math.BigInteger;

public class Problem034 {

	public static void main(String[] args) {
		int ans = 0;
		for (int i = 3; i <= 100000; i++) {
			BigInteger sum = BigInteger.ZERO;
			String num = String.valueOf(i);
			for (char digit : num.toCharArray()) {
				sum = sum.add(Functions.getFactorial(Character.getNumericValue(digit)));
			}
			if (sum.intValue() > i) {
				continue;
			}
			if (sum.intValue() == i) {
				ans += sum.intValue();
			}
		}
		System.out.println(ans);
	}
}
