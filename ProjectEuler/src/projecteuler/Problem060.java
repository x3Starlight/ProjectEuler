package projecteuler;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem060 {

	static int setSize = 5;
	static List<Long> primes = Functions.getPrimesLessThan(10000);
	static int ans = 100000;
	
	public static void main(String[] args) {	
		for (int n = 1; n < primes.size(); n++) {
			exec(new HashSet<>(), n);
		}
		System.out.println(ans);
	}	
	
	public static void exec(Set<Long> numSet, int index) {
		if (numSet.isEmpty()) {
			numSet.add(primes.get(index));
		}
		for (int n = index + 1; n < primes.size(); n++) {
			boolean res = true;
			long next = primes.get(n);
			if (next > ans) {
				break;
			}
			for (long i : numSet) {
				String str1 = String.valueOf(i);
				String str2 = String.valueOf(next);
				if (!Functions.isPrime(Integer.parseInt(str1 + str2)) || !Functions.isPrime(Integer.parseInt(str2 + str1))) {
					res = false;
					break;
				}
			}
			if (res) {
				numSet.add(next);
				if (numSet.size() < setSize) {
					exec(numSet, n);
				} else {
					int sum = 0;
					for (long num : numSet) {
						sum += num;
					}
					if (sum < ans) {
						ans = sum;
					}
				}
				numSet.remove(next);
			}
		}
	}
}
