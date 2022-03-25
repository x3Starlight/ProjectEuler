package projecteuler;

public class Problem073 {

	public static void main(String[] args) {
		int ans = 0;
		for (int d = 2; d <= 12000; d++) {
			for (int n = 1; n < d; n++) {
				if (Functions.getGCF(n, d) != 1) {
					continue;
				}
				double ratio = (double)n/d;
				if (ratio > (double)1/2) {
					break;
				}
				if (ratio > (double)1/3 && ratio < (double)1/2) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}
