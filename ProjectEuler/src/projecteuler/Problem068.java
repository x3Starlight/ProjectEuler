package projecteuler;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem068 {

	public static void main(String[] args) {
		
		String init = "1234567890";
		int sides = init.length()/2;
		long ans = 0;
		List<String> list = Functions.getPermutations(init, "", new ArrayList<String>());
		for (String str : list) {
			String[] outer = str.substring(0,sides).split("(?!^)");
			String[] inner = str.substring(sides,2*sides).split("(?!^)");
			if (!Arrays.asList(outer).contains("0")) {
				continue;
			}
			outer = Arrays.stream(outer).map(s -> s.replaceAll("0","10")).toArray(size -> new String[size]);
			
			int[] sums = new int[sides];
			for (int k = 0; k < sums.length; k++) {
				sums[k] = Integer.parseInt(outer[k%sides]) + Integer.parseInt(inner[k%sides]) + Integer.parseInt(inner[(k+1)%sides]);
			}
			
			if (Arrays.stream(sums).distinct().count() == 1) {
				String minOuter = String.valueOf(Arrays.stream(outer).mapToInt(Integer::parseInt).min().getAsInt());
				StringBuilder sb = new StringBuilder();
				for (int k = 0; k < outer.length; k++) {
					if (String.valueOf(outer[k]).equals(minOuter)) {
						for (int n = 0; n < outer.length; n++) {
							sb.append(outer[(k+n)%sides]).append(inner[(k+n)%sides]).append(inner[(k+n+1)%sides]);
						}
						break;
					}
				}
				long res = Long.parseLong(sb.toString());
				if (res > ans) {
					ans = res;
				}
			}
		}
		System.out.println(ans);
	}
}
