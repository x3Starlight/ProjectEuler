package projecteuler;

public class Problem039 {

	public static void main(String[] args) {
		int ans = 0;
		int max = 0;
		for (int p = 12; p <= 1000; p++) {
			int count = 0;
			for (int a = 1; a <= p/3; a++) {
				for (int b = a; b <= (p-a)/2; b++) {
					int c = p - b - a;
					if (a * a + b * b == c * c) {
						count++;
					}
				}
			}
			if (count >= max) {
				ans = p;
				max = count;
			}
		}
		System.out.println(ans);
	}
}
