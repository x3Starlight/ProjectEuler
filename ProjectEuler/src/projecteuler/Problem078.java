package projecteuler;

import java.util.ArrayList;
import java.util.List;

public class Problem078 {

	public static void main(String[] args) {
		
		List<Integer> pentagonal = new ArrayList<>();
		for (int n = 1;; n++) {
			int num1 = n*(3*n-1)/2;
			int num2 = -n*(-3*n-1)/2;
			if (num1 < 1000000) {
				pentagonal.add(num1);
			}
			if (num2 < 1000000) {
				pentagonal.add(num2);
			}
			if (num1 >= 1000000 && num2 >= 1000000) {
				break;
			}
		}
		
		List<Integer> res = new ArrayList<>();
		res.add(1);
		for (int n = 1;; n++) {
			int next = 0;
			for (int k = 0;; k++) {
				if (pentagonal.get(k) > n) {
					break;
				}
				int sign = (k % 4 > 1) ? -1 : 1;
				next += sign*res.get(n - pentagonal.get(k));
				next %= 1000000;
			}
			if (next != 0) {
				res.add(next);
			} else {
				System.out.println(n);
				System.exit(0);
			}
		}
	}
}
