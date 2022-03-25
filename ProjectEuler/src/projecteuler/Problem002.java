package projecteuler;

public class Problem002 {

	public static void main(String[] args) {
		int limit = 4000000;
		int f1 = 1, f2 = 2; int sum = 2;
		while (f2 + f1 < limit) {
			int f_new = f2 + f1;
			if (f_new % 2 == 0) {
				sum += f_new;
			}
			f1 = f2;
			f2 = f_new;
		}
		System.out.println(sum);
	}
}
