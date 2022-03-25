package projecteuler;


import java.util.Arrays;

public class Problem081 {

	public static void main(String[] args) {
		String[] data = Functions.readFile("Problem081.txt").split("\\r?\\n");
		int dim = data.length;
		int[][] arr = new int[dim][dim];
		for (int i = 0; i < dim; i++) {
			arr[i] = Arrays.stream(data[i].split(",")).mapToInt(Integer::parseInt).toArray(); 
		}
		
		for (int n = 1; n < dim; n++) {
			arr[0][n] += arr[0][n-1];
			arr[n][0] += arr[n-1][0];
		}
		for (int i = 1; i < dim; i++) {
			for (int j = 1; j < dim; j++) {
				arr[i][j] += Math.min(arr[i][j-1], arr[i-1][j]);
			}
		}
		System.out.println(arr[dim-1][dim-1]);
		
		
	}
}
