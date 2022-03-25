package projecteuler;


import java.util.ArrayList;
import java.util.List;

public class Problem047 {
	public static void main(String[] args) {
		
		List<Long> primes = new ArrayList<>();
		for (long n = 1;; n++) {
			if (Functions.isPrime(n)) {
				primes.add(n);
			}
			if ((Functions.getPrimeFactorization(n, primes).size() == 4) && (Functions.getPrimeFactorization(n+1, primes).size() == 4)
					&& (Functions.getPrimeFactorization(n+2, primes).size() == 4) && (Functions.getPrimeFactorization(n+3, primes).size() == 4)) {
				System.out.println(n);
				break;
			}
		}
	}
}
