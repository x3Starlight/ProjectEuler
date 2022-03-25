package projecteuler;

public class Problem006 {

	public static void main(String[] args) {
		long ans = 0;
		long sum1 = 0;
		long sum2 = 0;
		for (int i = 1; i <= 100; i++) {
			sum1 += i*i;
			sum2 += i;
		}
		ans = Math.abs(sum1 - (sum2*sum2));
		System.out.println(ans);
	}
}
