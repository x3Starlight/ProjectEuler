package projecteuler;


import java.math.BigInteger;
import java.util.List;
import java.util.Set;

public class Problem072 {

	public static void main(String[] args) {
		BigInteger ans = new BigInteger("0");
		int limit = 1000000;
		List<Long> primes = Functions.getPrimesLessThan(limit);
		long[] arr = new long[limit+1];
		arr[0] = 0;
		arr[1] = 0;
		
		for (int n = 2; n <= limit; n++) {
			if (primes.contains((long)n)) {
				arr[n] = n-1;
			} else if (n % 2 == 0) {
				int div = n / 2;
				if (div % 2 == 1) {
					arr[n] = arr[div];
				} else {
					arr[n] = 2*arr[div];
				}
			} else {
				arr[n] = n;
				Set<Long> factors = Functions.getPrimeFactorization(n, primes).keySet();
				for (long f : factors) {
					arr[n] = arr[n] * (f-1) / f;
				}
			}
			ans = ans.add(new BigInteger(String.valueOf(arr[n])));
		}
		System.out.println(ans.toString());
	}
}
