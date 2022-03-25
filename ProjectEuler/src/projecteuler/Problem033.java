package projecteuler;

public class Problem033 {

	public static void main(String[] args) {
		int numAns = 1;
		int denAns = 1;
		for (int i = 11; i <= 98; i++) {
			for (int j = i+1; j <= 99; j++) {
				if (i % 10 == 0 && j % 10 == 0) {
					continue;
				}
				String num = String.valueOf(i);
				String den = String.valueOf(j);
				if (!den.contains(num.substring(0,1)) && !den.contains(num.substring(1,2))) {
					continue;
				}

				double value = (double)i/j;
				
				String num2 = null;
				String den2 = null;
				int index = 0;
				if (den.contains(num.substring(0,1))) {
					index = den.indexOf(num.substring(0,1));
					num2 = num.substring(1,2);
				} else if (den.contains(num.substring(1,2))) {
					index = den.indexOf(num.substring(1,2));
					num2 = num.substring(0,1);
				}
				if (index == 0) {
					den2 = den.substring(1,2);
				} else if (index == 1) {
					den2 = den.substring(0,1);
				}
				double value2 = (double)Integer.parseInt(num2)/Integer.parseInt(den2);
				if (value == value2) {
					 numAns *= i;
					 denAns *= j;
				}
			}
		}
		System.out.println(denAns / Functions.getGCF(numAns, denAns));
	}
}
