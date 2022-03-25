package projecteuler;

public class Problem071 {

	public static void main(String[] args) {
		int ans = 0;
		double frac = 0;
		double limit = (double)3/7;
		for (int d = 2; d <= 1000000; d++) {
			for (int n = (int)Math.floor(d*limit); n < d; n++) {
				double ratio = (double)n/d;
				if (ratio >= limit) {
					break;
				} else if (ratio > frac) {
					ans = n;
					frac = ratio;
				}
			}
		}
		System.out.println(ans);
	}
}
