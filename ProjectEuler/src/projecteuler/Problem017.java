package projecteuler;

public class Problem017 {

	public static void main(String[] args) {
		int[] ones = new int[] {0,3,3,5,4,4,3,5,5,4};
		int[] teens = new int[] {0,6,6,8,8,7,7,9,8,8};
		int[] tens = new int[] {0,3,6,6,5,5,5,7,6,6};
		
		int ans = 0;
		for (int n = 1; n <= 1000; n++) {
			int letters = 0;
			if (n == 1000) {
				letters += 11;
			} else if (n / 100 != 0) {
				letters += ones[n/100] + 7;
				if (n % 100 != 0) {
					letters += 3;
				}
			}
			if ((n % 100 > 10) && (n % 100 < 20)) {
				letters += teens[n%10];
			} else {
				letters += tens[n%100/10];
				letters += ones[n%10];
			}
			ans += letters;
		}
		System.out.println(ans);
	}
}
