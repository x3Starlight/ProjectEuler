package projecteuler;


import java.util.*;

public class Problem075 {
	
	public static void main(String[] args) {
		int ans = 0;
		int limit = 1500000;
		Map<Integer, Integer> res = new HashMap<>();
		for (int n = 1; n <= Math.floor(Math.sqrt(limit)); n++) {
			for (int m = n+1;; m++) {
				if (Functions.getGCF(n, m) != 1 || (n%2==1 && m%2==1)) {
					continue;
				}
				int length = 2*m*(m+n);
				if (length > limit) {
					break;
				}
				for (int k = 1;; k++) {
					if (k*length > limit) {
						break;
					} else {
						if (res.containsKey(k*length)) {
							res.put(k*length, res.get(k*length)+1);
						} else {
							res.put(k*length, 1);
						}
					}
				}
			}
		}
		for (int value : res.values()) {
			if (value == 1) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
