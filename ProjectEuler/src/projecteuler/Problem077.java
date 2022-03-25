package projecteuler;

import java.util.List;

public class Problem077 {

	public static void main(String[] args) {
		
		List<Long> primes = Functions.getPrimesLessThan(10000);
		Long[] values = primes.toArray(new Long[primes.size()]);
		
		for(int k = 1; k <= 200; k++) {
			long [] count = new long[k+1];
			count[0] = 1;
			
			for (int i = 0; i < values.length; i++) {
				for (long j = values[i]; j <= k; j++) {
					count[(int)j] += count[(int)(j - values[i])];
				}
			}
			if (count[k] >= 5000) {
				System.out.println(k);
				System.exit(0);
			}
		}
	}
}
