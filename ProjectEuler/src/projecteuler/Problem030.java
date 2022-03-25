package projecteuler;

public class Problem030 {

	public static void main(String[] args) {
		int ans = 0;
		for (int i = 2; i < Math.pow(9,5)*5; i++) {
			int sum = Functions.getSumOfDigits(String.valueOf(i), 5);
			if (sum == i) {
				ans += sum;
			}
		}
		System.out.println(ans);
	}
}
