package projecteuler;

public class Problem010 {

	public static void main(String[] args) {
		long sum = 0;
		for (int i = 2; i < 2000000; i++) {
			if (Functions.isPrime(i)) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
