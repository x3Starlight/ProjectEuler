package projecteuler;

import java.util.List;

public class Problem049 {
	public static void main(String[] args) {
		List<Long> primeList = Functions.getPrimesBetween(1000, 10000);
		Long[] primes = primeList.toArray(new Long[primeList.size()]);
		for (int n = 0; n < primes.length; n++) {
			for (int k = n+1; k < primes.length; k++) {
				long m = 2*primes[k] - primes[n];
				if (primes[n] == 1487 || m >= 10000 || !Functions.isPrime(m)) {
					continue;
				}
				if (Functions.isPermuationOf(primes[k], primes[n]) && Functions.isPermuationOf(m, primes[n])) {
					String ans = String.valueOf(primes[n]) + String.valueOf(primes[k]) + String.valueOf(m);
					System.out.println(ans);
					break;
				}
			}
		}
	}
}
