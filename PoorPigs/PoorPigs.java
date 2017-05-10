
public class Solution {

	public static void main(String[] args) {
		System.out.println(poorPigs(1000, 15, 60));
	}

	public static int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
		int pigs = 0;
		int tests = minutesToTest / minutesToDie + 1;
		while (Math.pow(tests, pigs) < buckets) {
			pigs++;
		}
		return pigs;
	}

}
