package projecteuler;

public class Problem009 {

	public static void main(String[] args) {
		int ans = 0;
		for (int a = 1; a <= 998; a++) {
			for (int b = a; b <= 998; b++) {
				int c = 1000 - a - b;
				if (c * c == a * a + b * b) {
					ans = a * b * c;
					break;
				}
			}
		}
		System.out.println(ans);
	}
}
