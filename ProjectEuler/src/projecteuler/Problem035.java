package projecteuler;

public class Problem035 {

	public static void main(String[] args) {
		int ans = 0;
		for (int i = 1; i <= 1000000; i++) {
			if (!Functions.isPrime(i)) {
				continue;
			}
			if (i >= 10) {
				String str = String.valueOf(i);
				boolean b = true;
				for (int k = 1; k < str.length(); k++) {
					String firstDigit = str.substring(0, 1);
					str = str.substring(1).concat(firstDigit);
					if (!Functions.isPrime(Integer.parseInt(str))) {
						b = false;
						break;
					}
				}
				if (b) {
					ans++;
				}
			} else {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
