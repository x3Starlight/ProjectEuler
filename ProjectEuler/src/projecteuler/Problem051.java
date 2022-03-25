package projecteuler;


public class Problem051 {

	public static void main(String[] args) {
		for (int i = 10; i <= 999999; i++) {
			if (!Functions.isPrime(i)) {
				continue;
			}
			String num = String.valueOf(i);
			if (!num.contains("0") && !num.contains("1") && !num.contains("2")) {
				continue;
			}
			
			String next;
			int count = 1;
			if (num.contains("0")) {
				for (int n = 1; n <= 9; n++) {
					next = num.replaceAll("0", String.valueOf(n));
					if (Functions.isPrime(next)) {
						count++;
					}
					if (count == 8) {
						System.out.println(num);
						break;
					}
				}
			} else if (num.contains("1")) {
				for (int n = 2; n <= 9; n++) {
					next = num.replaceAll("1", String.valueOf(n));
					if (Functions.isPrime(next)) {
						count++;
					}
					if (count == 8) {
						System.out.println(num);
						break;
					}
				}
			}
		}
	}
}
