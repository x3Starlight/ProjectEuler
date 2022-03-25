package projecteuler;

import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Functions {

	// Read input file and return content as string
	public static String readFile(String path) {
		String content = null;
		try {
			BufferedReader reader = new BufferedReader(new FileReader(new File("txt/" + path)));
			content = reader.lines().collect(Collectors.joining(System.lineSeparator()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return content;
	}
	
	// Check if input number is a prime
	public static boolean isPrime(long input) {
		if (input <= 1) {
			return false;
		} else if (input <= 3) {
			return true;
		} else if ((input % 2 == 0) || (input % 3 == 0)) {
			return false;
		} else {
			for (long i = 5; i <= Math.sqrt(input); i = i + 6) {
				if ((input % i == 0) || (input % (i + 2) == 0)) {
					return false;
				}
			}
		}
		return true;
	}
	
	// Check if input string is a prime
	public static boolean isPrime(String input) {
		return isPrime(Long.parseLong(input));
	}
	
	// Get a list of primes less than input number
	public static ArrayList<Long> getPrimesLessThan(long input) {
		return getPrimesBetween(2, input);
	}
	
	// Get a list of primes between two input numbers
	public static ArrayList<Long> getPrimesBetween(long min, long max) {
		ArrayList<Long> primes = new ArrayList<>();
		if (min == 2) {
			primes.add(2L);
		}
		if (min % 2 == 0) {
			min = min + 1;
		}
		for (long i = min; i <= max; i = i + 2) {
			if (isPrime(i)) {
				primes.add(i);
			}
		}
		return primes;
	
	}
	
	// Check if input string is a palindrome
	public static boolean isPalindrome(String input) {
		StringBuilder sb =  new StringBuilder(input);
		if (sb.reverse().toString().equals(input)) {
			return true;
		}
		return false;
	}
	
	// Check if input number is a palindrome
	public static boolean isPalindrome(long input) {
		return isPalindrome(String.valueOf(input));
	}
	
	// Check if input BigInteger is a palindrome
	public static boolean isPalindrome(BigInteger input) {
		return isPalindrome(String.valueOf(input));
	}

	// Get the greatest common factor of two numbers
	public static long getGCF(long n1, long n2) {
		if (n2 == 0) {
			return n1;
		} else {
			return getGCF(n2, n1 % n2);
		}
	}

	// Get a map containing the prime factorization of a number
	public static Map<Long, Integer> getPrimeFactorization(long input, List<Long> primes) {
		Map<Long, Integer> factors = new HashMap<>();
		if (primes == null) {
			primes = getPrimesLessThan((long)Math.sqrt(input));
		}
		for (Long n : primes) {
			if (isPrime(input)) {
				factors.put(input, 1);
				break;
			}
			int count = 0;
			while (input % n == 0) {
				input = input / n;
				count++;
			}
			if (count != 0) {
				factors.put(n, count);
				if (isPrime(input)) {
					factors.put(input, 1);
					break;
				}
			}
		}
		return factors;
	}
	
	// Get the number of factors of a number
	public static int getNumberOfFactors(long input) {
		int count = 1;
		Map<Long, Integer> factors = getPrimeFactorization(input, null);
		for (int value : factors.values()) {
			count *= (value + 1);
		}
		return count;
	}
	
	// Get the sum of factors of a number
	public static int getSumOfFactors(long input) {
		int sum = 1;
		Map<Long, Integer> factors = getPrimeFactorization(input, null);
		for (long n : factors.keySet()) {
			sum *= (Math.pow(n,(factors.get(n)+1))-1)/(n-1);
		}
		return sum;
	}
	
	// Get a list of factors of a number
	public static List<Long> getFactorsOf(long input) {
		List<Long> list = new ArrayList<>();
		list.add(1L);
		for (long i = 2; i <= input/2; i++) {
			if (input % i == 0) {
				list.add(i);
			}
		}
		list.add(input);
		return list;
	}
	
	// Get the sum of digits of a string, raised to a power
	public static int getSumOfDigits(String input, int power) {
		int sum = 0;
		for (char digit : input.toCharArray()) {
			sum += Math.pow(Character.getNumericValue(digit), power);
		}
		return sum;
	}
	
	// Get the sum of digits of a string
	public static int getSumOfDigits(String input) {
		return getSumOfDigits(input, 1);
	}
	
	// Get the sum of digit factorials of a String
	public static int getSumOfDigitFactorials(String input) {
		int sum = 0;
		for (char digit : input.toCharArray()) {
			sum += getFactorial(Character.getNumericValue(digit)).intValue();
		}
		return sum;
	}
	
	// Get a list of permutations of a string
	public static List<String> getPermutations(String input, String res, List<String> perms) {
		if (input.length() <= 1) {
			perms.add(input + res);
		} else {
			for (int i = 0; i < input.length(); i++) {
				getPermutations(input.substring(0, i) + input.substring(i+1), res + input.charAt(i), perms);
			}
		}
		return perms;
	}
	
	// Check if input string is pandigital
	public static boolean isPandigital(String input) {
		boolean res = true;
		int length = input.length();
		for (int i = 1; i <= length; i++) {
			if (!input.contains(String.valueOf(i))) {
				res = false;
			}
		}
		return res;
	}
	
	// Get the factorial of input number
	public static BigInteger getFactorial(int input) {
		BigInteger res = BigInteger.ONE;
		for (int i = 1; i <= input; i++) {
			res = res.multiply(new BigInteger(String.valueOf(i)));
		}
		return res;
	}
	
	// Calculate number of permutations (n: sample, r: selection)
	public static BigInteger calcPermutations(int n, int r) {
		return getFactorial(n).divide(getFactorial(n-r));
	}
	
	// Calculate number of combinations (n: sample, r: selection)
	public static BigInteger calcCombinations(int n, int r) {
		return calcPermutations(n,r).divide(getFactorial(r));
	}
	
	// Get the numerical value of a string
	public static int getWordValue(String str) {
		int value = 0;
		for (char ch : str.toCharArray()) {
			value += Character.getNumericValue(ch) - 9;
		}
		return value;
	}
	
	// Check if two inupts are permutations
	public static boolean isPermuationOf(Long input, Long num) {
		boolean res = false;
		char[] inputArr = String.valueOf(input).toCharArray();
		char[] numArr = String.valueOf(num).toCharArray();
		Arrays.sort(inputArr);
		Arrays.sort(numArr);
		if (new String(inputArr).equals(new String(numArr))) {
			res = true;
		}
		return res;
	}
	
	// Check if input number is an integer
	public static boolean isInteger(double input) {
		if (input == (int)input) {
			return true;
		} else {
			return false;
		}
	}
	
	// Get square root of an integer to a specified number of digits, as a BigInteger.
	public static BigInteger getSquareRootDigits(int n, int digits) {
		BigInteger limit = new BigInteger("10").pow(digits+1);
		BigInteger a = new BigInteger(String.valueOf(5*n));
		BigInteger b = new BigInteger("5");
		
		while (b.compareTo(limit) < 0) {
			if (a.compareTo(b) >= 0) {
				a = a.subtract(b);
				b = b.add(new BigInteger("10"));
			} else {
				a = a.multiply(new BigInteger("100"));
				b = b.divide(new BigInteger("10")).multiply(new BigInteger("100")).add(new BigInteger("5"));
			}
		}
		return b.divide(new BigInteger("100"));
	}
	
}
