package projecteuler;

import java.util.List;

public class Problem069 {

	public static void main(String[] args) {
		int res = 1;
		List<Long> list = Functions.getPrimesLessThan(1000000);
		for (long n : list) {
			if (res * n < 1000000) {
				res *= n;
			} else {
				break;
			}
		}
		System.out.println(res);
	}
}
