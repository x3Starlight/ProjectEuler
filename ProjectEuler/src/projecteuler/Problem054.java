package projecteuler;


import java.util.Arrays;
import java.util.Comparator;

public class Problem054 {

	final static String ORDER = "0023456789TJQKA";
	
	public static void main(String[] args) {
		int count = 0;
		String[] data = Functions.readFile("Problem054.txt").split("\\r?\\n");
		for (String str : data) {
			String[] h1 = sortArray(str.substring(0,14).split(" "));
			String[] h2 = sortArray(str.substring(15,29).split(" "));
			int res1 = getResult(h1);
			int res2 = getResult(h2);
			
			if (res1 == res2) {
				String[] higherHand = compareHighest(h1, h2);
				if (higherHand == h1) {
					count++;
				}
			} else if (res1 > res2) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	private static String[] sortArray(String[] str) {
		Arrays.sort(str, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return ORDER.indexOf(s1.charAt(0)) - ORDER.indexOf(s2.charAt(0));
			}
		});
		return str;
	}
	
	private static String[] compareHighest(String[] h1, String[] h2) {
		String[] higherHand = null;
		int value1 = 0;
		int value2 = 0;
		for (int i = 4; i >= 0; i--) {
			value1 += ORDER.indexOf(h1[i].charAt(0));
			value2 += ORDER.indexOf(h2[i].charAt(0));
			if (value1 > value2) {
				higherHand = h1;
				break;
			} else if (value1 < value2) {
				higherHand =  h2;
				break;
			}
		}
		return higherHand;
	}
	
	private static int getResult(String[] hand) {
		int res = 0;
		if (isRoyalFlush(hand) != 0) {
			res += isRoyalFlush(hand);
		} else if (isStraightFlush(hand) != 0) {
			res += isStraightFlush(hand);
		} else if (isFourOfAKind(hand) != 0) {
			res += isFourOfAKind(hand);
		} else if (isFullHouse(hand) != 0) {
			res += isFullHouse(hand);
		} else if (isFlush(hand) != 0) {
			res += isFlush(hand);
		} else if (isStraight(hand) != 0) {
			res += isStraight(hand);
		} else if (isThreeOfAKind(hand) != 0) {
			res += isThreeOfAKind(hand);
		} else if (isTwoPairs(hand) != 0) {
			res += isTwoPairs(hand);
		} else if (isOnePair(hand)!= 0) {
			res += isOnePair(hand);
		}
		return res;
	}
	
	private static int isOnePair(String[] hand) {
		int res = 0;
		if (hand[0].charAt(0) == hand[1].charAt(0)) {
			res += 100 + ORDER.indexOf(hand[1].charAt(0));
		} else if (hand[1].charAt(0) == hand[2].charAt(0)) {
			res += 100 + ORDER.indexOf(hand[2].charAt(0));
		} else if (hand[2].charAt(0) == hand[3].charAt(0)) {
			res += 100 + ORDER.indexOf(hand[3].charAt(0));
		} else if (hand[3].charAt(0) == hand[4].charAt(0)) {
			res += 100 + ORDER.indexOf(hand[4].charAt(0));
		}
		return res;
	}
	
	private static int isTwoPairs(String[] hand) {
		int res = 0;
		if (hand[0].charAt(0) == hand[1].charAt(0) && hand[2].charAt(0) == hand[3].charAt(0)) {
			res = 200 + ORDER.indexOf(hand[3].charAt(0));
		} else if (hand[0].charAt(0) == hand[1].charAt(0) && hand[3].charAt(0) == hand[4].charAt(0)
				|| (hand[1].charAt(0) == hand[2].charAt(0) && hand[3].charAt(0) == hand[4].charAt(0))) {
			res = 200 + ORDER.indexOf(hand[4].charAt(0));
		}
		return res;
	}
	
	private static int isThreeOfAKind(String[] hand) {
		int res = 0;
		if (hand[0].charAt(0) == hand[1].charAt(0) && hand[1].charAt(0) == hand[2].charAt(0)) {
			res = 300 + ORDER.indexOf(hand[2].charAt(0));
		} else if (hand[1].charAt(0) == hand[2].charAt(0) && hand[2].charAt(0) == hand[3].charAt(0)) {
			res = 300 + ORDER.indexOf(hand[3].charAt(0));
		} else if (hand[2].charAt(0) == hand[3].charAt(0) && hand[3].charAt(0) == hand[4].charAt(0)) {
			res = 300 + ORDER.indexOf(hand[4].charAt(0));
		}
		return res;
	}
	
	private static int isStraight(String[] hand) {
		int res = 0;
		if ((ORDER.indexOf(hand[4].charAt(0)) - ORDER.indexOf(hand[3].charAt(0)) == 1) 
			&& (ORDER.indexOf(hand[3].charAt(0)) - ORDER.indexOf(hand[2].charAt(0)) == 1)
			&& (ORDER.indexOf(hand[2].charAt(0)) - ORDER.indexOf(hand[1].charAt(0)) == 1)
			&& (ORDER.indexOf(hand[1].charAt(0)) - ORDER.indexOf(hand[0].charAt(0)) == 1)) {
			res = 400 + ORDER.indexOf(hand[4].charAt(0));
		}
		return res;
	}
	
	private static int isFlush(String[] hand) {
		int res = 0;
		if (hand[0].charAt(1) == hand[1].charAt(1)
				&& hand[1].charAt(1) == hand[2].charAt(1)
				&& hand[2].charAt(1) == hand[3].charAt(1)
				&& hand[3].charAt(1) == hand[4].charAt(1)) {
			res = 500 + ORDER.indexOf(hand[4].charAt(0));
		}
		return res;
	}
	
	private static int isFullHouse(String[] hand) {
		int res = 0;
		if ((hand[0].charAt(0) == hand[1].charAt(0) && hand[1].charAt(0) == hand[2].charAt(0) && hand[3].charAt(0) == hand[4].charAt(0))
				|| (hand[0].charAt(0) == hand[1].charAt(0) && hand[2].charAt(0) == hand[3].charAt(0) && hand[3].charAt(0) == hand[4].charAt(0))) {
			res = 600 + ORDER.indexOf(hand[4].charAt(0));
		}
		return res;
	}
	
	private static int isFourOfAKind(String[] hand) {
		int res = 0;
		if (hand[0].charAt(0) == hand[1].charAt(0) && hand[1].charAt(0) == hand[2].charAt(0) && hand[2].charAt(0) == hand[3].charAt(0)) {
			res = 700 + ORDER.indexOf(hand[3].charAt(0));
		} else if (hand[1].charAt(0) == hand[2].charAt(0) && hand[2].charAt(0) == hand[3].charAt(0) && hand[3].charAt(0) == hand[4].charAt(0)) {
			res = 700 + ORDER.indexOf(hand[4].charAt(0));
		}
		return res;
	}
	
	private static int isStraightFlush(String[] hand) {
		int res = 0;
		if (isStraight(hand) != 0 && isFlush(hand) != 0) {
			res = 800 + ORDER.indexOf(hand[4].charAt(0));
		}
		return res;
	}
	
	private static int isRoyalFlush(String[] hand) {
		int res = 0;
		if (hand[0].charAt(0) == 'T' && isStraight(hand) != 0 && isFlush(hand) != 0) {
			res = 900;
		}
		return res;
	}
}
