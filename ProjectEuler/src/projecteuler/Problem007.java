package projecteuler;

public class Problem007 {

	public static void main (String[] args) {
		int index = 10001;
		int count = 0;
		for (int i = 1;; i++) {	
			if (Functions.isPrime(i)) {
				if (count == index) {
					System.out.println(i);
					break;
				}
				count++;
			}
		};
	}
}
