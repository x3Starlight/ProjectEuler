package projecteuler;

public class Problem012 {

	public static void main(String[] args) {
		long ans = 0;
		for (long n = 1;; n++) {
			long i = n*(n+1)/2;
			if (Functions.getNumberOfFactors(i) > 500) {
				ans = i;
				break;
			}
		}
		System.out.println(ans);
	}
}
