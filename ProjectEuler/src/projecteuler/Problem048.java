package projecteuler;


import java.math.BigInteger;

public class Problem048 {

	public static void main(String[] args) {
		BigInteger ans = new BigInteger("0");
		for (int n = 1; n <= 1000; n++) {
			BigInteger toAdd = new BigInteger(String.valueOf(n)).pow(n);
			ans = ans.add(toAdd).remainder(new BigInteger("10000000000"));
		}
		System.out.println(ans);
	}
}
