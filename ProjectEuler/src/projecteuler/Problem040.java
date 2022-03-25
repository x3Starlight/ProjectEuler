package projecteuler;


import java.util.function.IntFunction;

public class Problem040 {

	public static void main(String[] args) {

		IntFunction<Integer> getDigit = (i) -> {
			int digit = 0;
			int num = 0;
			int pos = 0;

			int n0 = 0;
			int n1 = 9;
			int n2 = n1 + 90 * 2;
			int n3 = n2 + 900 * 3;
			int n4 = n3 + 9000 * 4;
			int n5 = n4 + 90000 * 5;
			int n6 = n5 + 900000 * 6;

			if (i <= n1) {
				num = 1 + (i - n0 - 1) / 1;
				pos = (i - n0 - 1) % 1;
			} else if (i <= n2) {
				num = 10 + (i - n1 - 1) / 2;
				pos = (i - n1 - 1) % 2;
			} else if (i <= n3) {
				num = 100 + (i - n2 - 1) / 3;
				pos = (i - n2 - 1) % 3;
			} else if (i <= n4) {
				num = 1000 + (i - n3 - 1) / 4;
				pos = (i - n3 - 1) % 4;
			} else if (i <= n5) {
				num = 10000 + (i - n4 - 1) / 5;
				pos = (i - n4 - 1) % 5;
			} else if (i <= n6) {
				num = 100000 + (i - n5 - 1) / 6;
				pos = (i - n5 - 1) % 6;
			}
			digit = Character.getNumericValue(Integer.toString(num).charAt(pos));
			return digit;
		};

		System.out.println(getDigit.apply(1) * getDigit.apply(10) * getDigit.apply(100) * getDigit.apply(1000)
				* getDigit.apply(10000) * getDigit.apply(100000) * getDigit.apply(1000000));
	}
}
