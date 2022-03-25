package projecteuler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem062 {

	public static void main(String[] args) {
		int size = 5;
		for (int digits = 1;; digits++) {
			Map<String, List<Long>> map = new HashMap<>();
			for (long n = (long) Math.cbrt(Math.pow(10, digits - 1)) + 1; n <= (long) Math
					.cbrt(Math.pow(10, digits)); n++) {
				char[] arr = String.valueOf(n * n * n).toCharArray();
				Arrays.sort(arr);
				String num = new String(arr);
				map.computeIfAbsent(num, k -> new ArrayList<>());
				map.get(num).add(n);
			}
			for (String str : map.keySet()) {
				if (map.get(str).size() == size) {
					long ans = map.get(str).get(0);
					System.out.println(ans*ans*ans);
					System.exit(0);
				}
			}
		}
	}
}
