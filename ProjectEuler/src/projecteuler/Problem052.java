package projecteuler;


import java.util.ArrayList;
import java.util.List;

public class Problem052 {

	public static void main(String[] args) {
		long ans = 0;
		for (long n = 1;; n++) {
			List<String> perms = new ArrayList<>();			
			Functions.getPermutations(String.valueOf(n), "", perms);
			
			if (perms.contains(String.valueOf(n*2)) && perms.contains(String.valueOf(n*3)) && perms.contains(String.valueOf(n*4))
					&& perms.contains(String.valueOf(n*5)) && perms.contains(String.valueOf(n*6))) {
				ans = n;
				break;
			}
		}
		System.out.println(ans);
	}
}
