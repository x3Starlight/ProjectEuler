package projecteuler;

public class Problem076 {
	
	public static void main(String[] args) {

		int target = 100;
		int[] values = new int[target-1];
		for(int i = 0; i < target-1; i++) {
			values[i] = i+1;
		}
		
		long[] count = new long[target+1];
		count[0] = 1;
		
		for (int i = 0; i < values.length; i++) {
			for (int j = values[i]; j <= target; j++) {
				count[j] += count[j - values[i]];
			}
		}
		System.out.println(count[target]);
	}
}
