package projecteuler;

public class Problem064 {

	public static void main(String[] args) {
		int ans = 0;
		for (int n = 1; n <= 10000; n++) {
			if (Functions.isInteger(Math.sqrt(n))) {
				continue;
			}
			int length = 0;
			int m = 0;
			int d = 1;
			int a = (int)Math.floor(Math.sqrt(n));
			int m0 = m;
			int d0 = d;
			int a0 = a;
			for (int k = 1;; k++) {
				int m1 = a*d-m;
				int d1 = (n-m1*m1)/d;
				int a1 = (int)Math.floor((Math.sqrt(n)+m1)/d1);
				
				if (k == 1) {
					m0 = m1;
					d0 = d1;
					a0 = a1;
				} else if (m1 == m0 && d1 == d0 && a1 == a0) {
					if (length % 2 == 1) {
						ans++;
					}
					break;
				}
				m = m1;
				d = d1;
				a = a1;
				length++;
			}
		}
		System.out.println(ans);
	}
}
