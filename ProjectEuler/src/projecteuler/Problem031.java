package projecteuler;

public class Problem031 {
	
	public static void main(String[] args) {
		int[] coins = new int[] {1,2,5,10,20,50,100,200};
		int[] count = new int[200+1];
		count[0] = 1;
		
		for (int i = 0; i < coins.length; i++) {
			for (int j = coins[i]; j <= 200; j++) {
				count[j] += count[j - coins[i]];
			}
		}
		System.out.println(count[200]);
	}
}
