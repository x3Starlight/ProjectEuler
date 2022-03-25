package projecteuler;

public class Problem042 {

	public static void main(String[] args) {
		String data = Functions.readFile("Problem042.txt");
		data = data.replaceAll("\"", "");
		String arr[] = data.split(",");
		
		int ans = 0;
		for (String str : arr) {
			int value = Functions.getWordValue(str);
			if (Functions.isInteger((-1 + Math.sqrt(1 + 8*value))/2)) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
