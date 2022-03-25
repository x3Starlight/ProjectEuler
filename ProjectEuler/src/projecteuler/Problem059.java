package projecteuler;

import java.util.Arrays;

public class Problem059 {
	
	public static void main(String[] args) {
		int[] data = Arrays.asList(Functions.readFile("Problem059.txt").split(",")).stream().mapToInt(Integer::parseInt).toArray();
		for (int a = 97; a <= 122; a++) {
			for (int b = 97; b <= 122; b++) {
				for (int c = 97; c <= 122; c++) {
					int sum = 0;
					StringBuilder str = new StringBuilder();
					for (int i = 0; i < data.length - 2;) {
						int n1 = data[i] ^ a;
						int n2 = data[i+1] ^ b;
						int n3 = data[i+2] ^ c;
						sum += n1 + n2 + n3;
						i += 3;
						str.append((char)n1 + "" + (char)n2 + "" + (char)n3);
					}
					if (str.indexOf(" the ") > -1) {
						System.out.println(sum);
					}
				}
			}
		}
	}
}
