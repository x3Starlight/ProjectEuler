package projecteuler;

import java.util.Arrays;

public class Problem022 {

	public static void main(String[] args) {
		String data = Functions.readFile("Problem022.txt");
		data = data.replaceAll("\"", "");
		String arr[] = data.split(",");
		Arrays.sort(arr);
		int sum = 0;
		for (int n = 0; n < arr.length; n++) {
			int value = Functions.getWordValue(arr[n]);
			sum += value * (n+1);
		}
		System.out.println(sum);
	}
}