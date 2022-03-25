package projecteuler;

public class Problem028 {

	public static void main(String[] args) {
		long sum = 1;
		int size = 1001;
		for (int i = 3; i <= size; i = i+2) {
			sum += 2*(i*i + (i-2)*(i-2)+(i-1));
		}
		System.out.println(sum);
	}
}
