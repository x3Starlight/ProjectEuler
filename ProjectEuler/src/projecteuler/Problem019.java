package projecteuler;

public class Problem019 {

	public static void main(String[] args) {
		int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int day = 366;
		int count = 0;
		for (int y = 1901; y <= 2000; y++) {
			for (int m : days) {
				day += m;
				if ((m == 28) && (y % 4 == 0)) {
					day += 1;
				}
				if (day % 7 == 0) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
