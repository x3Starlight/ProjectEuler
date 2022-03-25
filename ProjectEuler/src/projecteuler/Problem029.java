package projecteuler;

import java.math.BigInteger;
import java.util.HashSet;

public class Problem029 {

	public static void main(String[] args) {
		HashSet<BigInteger> set = new HashSet<>();
		for (int a = 2; a <= 100; a++) {
			for (int b  = 2; b <= 100; b++) {
				BigInteger num = new BigInteger(String.valueOf(a)).pow(b);
				set.add(num);
			}
		}
		System.out.println(set.size());
	}

}
