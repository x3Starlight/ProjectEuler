package projecteuler;

import java.util.Set;
import java.util.TreeSet;

public class Problem023 {

	public static void main(String[] args) {
		int ans = 0;
		Set<Integer> set = new TreeSet<>();
		for (int i = 12; i <= 28124; i++) {
			int sum = Functions.getSumOfFactors(i)-i;
			if (sum > i) {
				set.add(i);
			}
		}
		Integer[] arr = new Integer[set.size()];
		set.toArray(arr);
		Set<Integer> sums = new TreeSet<>();
		for (int n = 0; n < arr.length; n++) {
			for (int k = n; k < arr.length; k++ ) {
				sums.add(arr[n] + arr[k]);
				if (arr[n] + arr[k] >= 28124) {
					break;
				}
			}
		}
		for (int i = 1; i < 28124; i++) {
			if (!sums.contains(i)) {
				ans += i;
			}
		}
		System.out.println(ans);
	}
}
