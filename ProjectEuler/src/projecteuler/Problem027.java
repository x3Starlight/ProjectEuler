package projecteuler;

public class Problem027 {

	public static void main(String[] args) {
		int primes = 0;
		int ans = 0;
		for (int a = -999; a <= 999; a++) {
			for (int b = -1000; b <= 1000; b++) {
				int count = 0;
				for (int n = 0;; n++) {
					int val = n*n + a*n + b;
					if (!Functions.isPrime(val)) {
						break;
					} else {
						count++;
					}
				}
				if (count > primes) {
					primes = count;
					ans = a * b;
				}
			}
		}
		System.out.println(ans);
	}
}
