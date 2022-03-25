package projecteuler;

public class Problem037 {

	public static void main(String[] args) {
		int ans = 0;
		int count = 0;
		for (int i = 11;; i++) {
			if (!Functions.isPrime(i)) {
				continue;
			}
			if (count == 11) {
				break;
			}
			String str = String.valueOf(i);
			String strLeft = str;
			String strRight = str;
			
			boolean b = true;
			while (strLeft.length() > 1) {
				strLeft = strLeft.substring(1);
				if (!Functions.isPrime(strLeft)) {
					b = false;
					break;
				}
			}
			while (strRight.length() > 1) {
				strRight = strRight.substring(0, strRight.length()-1);
				if (!Functions.isPrime(strRight)) {
					b = false;
					break;
				}
			}
			if (b) {
				ans += i;
				count++;
			}
		}
		System.out.println(ans);
		System.out.println(count);
	}
}
