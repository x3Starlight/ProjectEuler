package projecteuler;

import java.util.List;

public class Problem050 {
	
	public static void main(String[] args) {
		long ans = 0;
		int length = 0;
		int bound = 1000000;
		List<Long> primes = Functions.getPrimesLessThan(bound);

		for (int i = 0; i < primes.size(); i++) {
			long sum = 0;
			for (int k = i; k < primes.size(); k++) {
				sum += primes.get(k);
				if (sum > bound) {
					break;
				} else if (k-i+1 > length && sum > ans && Functions.isPrime(sum) ) {
					ans = sum;
					length = k-i+1;
				}
			}
		}
		System.out.println(ans);
	}
}
