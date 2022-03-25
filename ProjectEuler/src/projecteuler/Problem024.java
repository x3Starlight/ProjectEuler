package projecteuler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem024 {

	public static void main(String[] args) {
		String input = "0123456789";
		List<String> perms = new ArrayList<>();
		perms = Functions.getPermutations(input, "", perms);
		Collections.sort(perms);
		System.out.println(perms.get(1000000-1));
	}
}
