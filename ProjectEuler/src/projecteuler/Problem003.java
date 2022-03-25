package projecteuler;

public class Problem003 {
	
	public static void main(String[] args) {
		long ans = 0L;
		long input = 600851475143L;
		for (long i = (long)Math.floor(Math.sqrt(input));; i--) {
			if ((Functions.isPrime(i) && (input % i == 0))) {
				ans = (long)i;
				break;
			}
		}
		System.out.println(ans);
	}
}
