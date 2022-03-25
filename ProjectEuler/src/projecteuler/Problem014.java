package projecteuler;

public class Problem014 {

	public static void main(String args[]) {		
		int terms = 1000000;
		int[] arr = new int[terms];
		arr[0] = 1;
		int ans = 1;
		for (int n = 2; n <= terms; n++) {
			int count = 0;
			long i = n;
			while(true) {
				if (i % 2 == 1) {
					i = 3*i+1;
				} else {
					i = i/2;
				}
				count++;
				if (i < n) {
					arr[n-1] = arr[(int)(i-1)] + count;
					break;
				} else if (i == 1) {
					arr[n-1] = count;
					break;
				}
			}
			if (arr[n-1] > arr[ans-1]) {
				ans = n;
			}
		}
		System.out.println(ans + " " +  arr[ans-1]);
	}
}
