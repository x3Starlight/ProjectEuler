package projecteuler;


import java.util.ArrayList;
import java.util.List;

public class Problem043 {

	public static void main(String[] args) {
		long sum = 0;
		List<String> perms = new ArrayList<>();
		perms = Functions.getPermutations("1234567890", "", perms);
		for (String str : perms) {
			double num = Math.floor(Double.parseDouble(str));
			if (num < Math.pow(10, 9)) {
				continue;
			}
		
			if (Functions.isInteger(Math.floor(num % 1000) / 17)
					&& Functions.isInteger(Math.floor(num % 10000 / 10) / 13)
					&& Functions.isInteger(Math.floor(num % 100000 / 100) / 11)
					&& Functions.isInteger(Math.floor(num % 1000000 / 1000) / 7)
					&& Functions.isInteger(Math.floor(num % 10000000 / 10000) / 5)
					&& Functions.isInteger(Math.floor(num % 100000000 / 100000) / 3)
					&& Functions.isInteger(Math.floor(num % 1000000000 / 1000000) / 2)) {
				sum += num;
				}
		}
		System.out.println(sum);
	}
}
