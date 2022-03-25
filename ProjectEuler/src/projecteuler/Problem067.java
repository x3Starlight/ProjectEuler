package projecteuler;

import java.util.Arrays;

public class Problem067 {
	
	public static void main(String[] args) {
		String[] data = Functions.readFile("Problem067.txt").split("\\r?\\n");
		int arr[][] = new int[data.length][data.length];;
		for (int i = 0; i < data.length; i++) {
			arr[i] = Arrays.stream(data[i].split(" ")).mapToInt(Integer::parseInt).toArray(); 
		}

		for (int i = arr.length-1; i > 0; i--) {
			for (int j = 0; j < arr[i].length-1; j++ ) {
				arr[i-1][j] = Math.max(arr[i-1][j]+arr[i][j], arr[i-1][j]+arr[i][j+1]);
			}
		}
		System.out.println(arr[0][0]);
	}
}
