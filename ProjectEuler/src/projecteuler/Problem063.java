package projecteuler;


public class Problem063 {

	public static void main(String[] args) {
		int count = 0;
		for (int n = 1; n < 10; n++) {
			for (int d = 1; d <= 1/(1-Math.log10(n)); d++) {
				if (d-1 <= d*Math.log10(n) && Math.log10(n) < d) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
