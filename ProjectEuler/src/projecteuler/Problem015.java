package projecteuler;

public class Problem015 {

	public static void main(String[] args) {
		int size = 21;
		long[][] arr = new long[size][size];
		arr[0][0] = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == 0 || j == 0) {
					arr[i][j] = 1;
				} else {
					arr[i][j] = arr[i-1][j] + arr[i][j-1];
				}
			}
		}
		System.out.println(arr[size-1][size-1]);
	}
}
