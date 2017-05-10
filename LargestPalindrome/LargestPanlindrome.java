import java.io.BufferedReader;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		System.out.println("Input: ");
		Scanner sc = new Scanner(System.in);
		int largestPalindrom = largestPalindrome(sc.nextInt());
		System.out.println("Output: " + largestPalindrom % 1337);
	}

	public static int largestPalindrome(int n) {
		if (n == 1) {
			return 9;
		}
		// if n = 3 then max = 999
		int upperBound = (int) Math.pow(10, n) - 1;
		int lowerBound = upperBound / 10;
		for (int v = upperBound - 1; v > lowerBound; v--) {
			// creates maximum assumed palindrom
			// e.g. if n = 3 first time the maximum assumed palindrom will be
			// 998 899
			long palindrome = Long.valueOf(v + new StringBuilder().append(v).reverse().toString());
			for (long x = upperBound; x * x >= palindrome; x--) {
				if (palindrome % x == 0) {
					System.out.println("numbers multiplied : " + x + " * " + palindrome / x);
					System.out.println("palindrome :" + palindrome);
					return (int) (palindrome % 1337);
				}
			}
		}
		return 0;
	}

	public static int reverseNumber(int num) {
		int reverseNumber = 0;
		while (num != 0) {
			reverseNumber = (reverseNumber * 10) + (num % 10);
			num = num / 10;
		}
		return reverseNumber;
	}
}
