package projecteuler;

public class Problem005 {
	
	public static void main(String[] args) {
		long ans = 1;
		for (int i = 1; i <= 20; i++) {
			if (ans % i != 0) {
				ans = ans * (i / Functions.getGCF(i, ans));
			}
		}
		System.out.println(ans);
	}
}
