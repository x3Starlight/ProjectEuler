package projecteuler;

public class Problem038 {

	public static void main(String[] args) {
		long ans = 0;
		for (int i = 1; i <= 10000; i++) {
			StringBuilder sb = new StringBuilder();
			boolean b = false;
			for (int k = 1;; k++) {
				sb.append(i * k);
				if (sb.length() >= 9) {
					b = Functions.isPandigital(sb.toString());
					break;
				}
			}
			long num = Long.parseLong(sb.toString());
			if (b && num > ans) {
				ans = num;
			}
		}
		System.out.println(ans);
	}
}
