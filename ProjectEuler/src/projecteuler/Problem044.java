package projecteuler;

public class Problem044 {

	public static void main(String[] args) {
		int sum = 0;
		int diff = 0;
		int length = 3000;
		int[] p = new int[length];
		for (int n = 1; n <= length; n++) {
			p[n-1] = n*(3*n-1)/2;
		}
		
		for (int j = 0; j < length; j++) {
			for (int k = j+1; k < length; k++) {
				sum = p[j] + p[k];
				diff = Math.abs(p[j] - p[k]);
				if ((Functions.isInteger((1 + Math.sqrt(1+24*sum)) / 6) && Functions.isInteger(((1 + Math.sqrt(1+24*diff)) / 6)))) {
					System.out.println(diff);
				}
			}
		}
	}
}
