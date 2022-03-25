package projecteuler;

public class Problem026 {

	public static void main(String[] args) {
		int ans = 0;
		for (int n = 2; n < 1000; n++) {
			int[] remainders = new int[n];
			int value = 1;
			int length = 0;
			while(true) {
				value = (value * 10) % n;
				if (value == 0 || remainders[value] != 0) {
					break;
				}
				length++;
				remainders[value] = 1;
			}
			if (length > ans) {
				ans = n;
			}
		}
		System.out.println(ans);
	}
}
