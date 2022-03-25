package projecteuler;


import java.util.ArrayList;
import java.util.List;

public class Problem074 {

	static int limit = 1000000;
	static int[] arr = new int[limit+1];
	
	public static void main(String[] args) {
		int ans = 0;
		arr[0] = 0;
		for (long n = 10; n <= limit; n++) {
			if (arr[(int)n] == 0) {
				List<Long> chain = new ArrayList<>();
				chain.add(n);
				exec(n, chain);
			}
		}
		for (int count : arr) {
			if (count == 60) {
				ans++;
			}
		}
		System.out.println(ans);
	}
	
	public static void exec(long num, List<Long> chain) {
		long next = Functions.getSumOfDigitFactorials(String.valueOf(num));
		if (!chain.contains(next)) {
			chain.add(next);
			exec(next, chain);
		} else {
			for (long n : chain) {
				if (n <= limit) {
					arr[(int)n] = chain.size() - chain.indexOf(n);
				}
			}
		}
	}
}
