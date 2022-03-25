package projecteuler;

public class Problem045 {

	public static void main(String[] args) {
		long ans = 0;
		for (int n = 144;; n++) {
			long hn = n*(2*n-1);
			if ((Functions.isInteger((1 + Math.sqrt(1+24*hn)) / 6)) && Functions.isInteger((-1 + Math.sqrt(1+8*hn)) / 2)) {
				ans = hn;
				break;
			}
		}
		System.out.println(ans);
	}
}