package projecteuler;

public class Problem046 {

	public static void main(String[] args) {
		for (int n = 9;; n = n + 2) {
			if (Functions.isPrime(n)) {
				continue;
			}
			
			boolean found = false;
			for (int k = 1;; k++) {
				int diff = n - 2*k*k;
				if ((diff < 0)) {
					break;
				} else if (Functions.isPrime(diff)) {
					found = true;
					break;
				}
			}
			if (!found) {
				System.out.println(n);
				break;
			}
		}
	}
}
