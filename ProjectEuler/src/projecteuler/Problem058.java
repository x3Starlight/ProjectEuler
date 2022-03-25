package projecteuler;

public class Problem058 {

	public static void main(String[] args) {
		int ans = 0;
		int length = 1;
		int primes = 0;
		int total = 1;
		
		while(true) {
			length += 2;
			total += 4;
			if (Functions.isPrime(length*length - length + 1)) {
				primes++;
			}
			if (Functions.isPrime(length*length - 2*length + 2)) {
				primes++;
			}
			if (Functions.isPrime(length*length - 3*length + 3)) {
				primes++;
			}
			double ratio = (double)primes / (double)total;
			if (ratio <= 0.1) {
				ans = length;
				break;
			}
		}
		System.out.println(ans);
	}
}
