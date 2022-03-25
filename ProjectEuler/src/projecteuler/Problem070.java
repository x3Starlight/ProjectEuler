package projecteuler;


import java.util.List;

public class Problem070 {

	public static void main(String[] args) {
		long ans = 0;
		double ratio = 2;
		List<Long> primes = Functions.getPrimesLessThan(10000);
		for (int i = 0; i < primes.size(); i++) {
			for (int j = 0; j < primes.size(); j++) {
				long prod = primes.get(i)*primes.get(j);
				if (prod > Math.pow(10, 7)) {
					break;
				}
				
				long phi = (primes.get(i)-1)*(primes.get(j)-1);
				double _ratio = (double)prod/phi;
				if (Functions.isPermuationOf(phi, prod) && _ratio < ratio) {
					ans = prod;
					ratio = _ratio;
				}
			}
		}
		System.out.println(ans);
	}
}
