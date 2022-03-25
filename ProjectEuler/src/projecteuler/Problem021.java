package projecteuler;

public class Problem021 {

	public static void main(String[] args) {
		int ans = 0;
		for (int n = 2; n < 10000; n++) {
			int sum = Functions.getSumOfFactors(n) - n;
			if (((Functions.getSumOfFactors(sum)- sum) == n) && sum != n) {
				ans += n;
			}
		}
		System.out.println(ans);
	}

}
