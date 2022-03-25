package projecteuler;


import java.util.ArrayList;
import java.util.List;

public class Problem041 {

	public static void main(String[] args) {
		long ans = 0;
		String num = "987654321";
		List<String> perms = new ArrayList<>();
		for (;;) {
			perms = Functions.getPermutations(num, "", perms);
			for (String str : perms) {
				long n = Long.parseLong(str);
				if (Functions.isPrime(n) && n > ans) {
					ans = n;
				}
			}
			if (ans == 0) {
				num = num.substring(1);
			} else {
				break;
			}
		}
		System.out.println(ans);
	}
}
