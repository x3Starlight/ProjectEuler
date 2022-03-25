package projecteuler;

import java.util.HashSet;
import java.util.Set;

public class Problem032 {

	public static void main(String[] args) {
		int ans = 0;
		Set<Integer> set = new HashSet<>();
		for (int i = 2; i <= 9; i++) {
			for (int j = 1234; j <= 10000/2; j++) {
				String str = String.valueOf(i) + String.valueOf(j) + String.valueOf(i*j);
				if (str.length() == 9 && Functions.isPandigital(str)) {
					set.add(i*j);
				}
			}
		}
		for (int i = 12; i <= 98; i++) {
			for (int j = 123; j <= 10000/12; j++) {
				String str = String.valueOf(i) + String.valueOf(j) + String.valueOf(i*j);
				if (str.length() == 9 && Functions.isPandigital(str)) {
					set.add(i*j);
				}
			}
		}
		for (int k : set) {
			ans += k;
		}
		System.out.println(ans);
	}
}
