package projecteuler;


import java.util.HashSet;
import java.util.Set;

public class Problem061 {

	@SuppressWarnings("unchecked")
	static Set<Integer>[] numbers = new Set[6];
	
	public static void main(String[] args) {
		Set<Integer> remainingSets = new HashSet<>();
		for (int k = 0; k < numbers.length; k++) {
			numbers[k] = new HashSet<>();
			remainingSets.add(k);
		}

		for (int k = 0; k < numbers.length; k++) {
			for (int n = 1;; n++) {
				int toAdd = n * (n * (k + 1) - (k + 1) + 2) / 2;
				if (toAdd > 9999) {
					break;
				} else if (toAdd < 1000 || toAdd % 100 < 10) {
					continue;
				} else {
					numbers[k].add(toAdd);
				}
			}
		}

		for (int a : numbers[numbers.length-1]) {
			Set<Integer> result = new HashSet<>();
			result.add(a);
			remainingSets.remove(numbers.length-1);
			search(a, a, remainingSets, result);
		}
	}
	
	public static void search(int init, int num, Set<Integer> remainingSets, Set<Integer> result) {
		if (remainingSets.size() == 0 && num % 100 == init / 100) {
			int sum = 0;
			for (int n : result) {
				sum += n;
			}
			System.out.println(sum);
		} else {
			for (int n : remainingSets) {
				for (int k : numbers[n]) {
					if (num % 100 == k / 100 ) {
						Set<Integer> _remainingSets = new HashSet<>(remainingSets);
						Set<Integer> _result = new HashSet<>(result);
						_remainingSets.remove(n);
						_result.add(k);
						search(init, k, _remainingSets, _result);
					}
				}
			}
		}
	}
}
