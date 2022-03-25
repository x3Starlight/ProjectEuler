package projecteuler;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Problem079 {

	public static void main(String[] args) {
		List<Character> ans = new LinkedList<Character>();
		String[] data = Functions.readFile("Problem079.txt").split("\\r?\\n");
		for (String str : data) {
			char[] charArray = str.toCharArray();
			for (char ch : charArray) {
				if (!ans.contains(ch)) {
					ans.add(ch);
				}
			}
			for (int i = 0; i < charArray.length-1; i++) {
				if (ans.indexOf(charArray[i]) > ans.indexOf(charArray[i+1])) {
					Collections.swap(ans, ans.indexOf(charArray[i]), ans.indexOf(charArray[i+1]));
				}
			}
		}
		for (char ch : ans) {
			System.out.print(ch);
		}	
	}
}
