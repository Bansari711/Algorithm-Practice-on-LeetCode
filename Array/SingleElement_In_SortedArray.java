import java.awt.font.NumericShaper;
import java.util.Arrays;

public class Solution {

	private static int lowerIndex;
	private static int higherIndex;

	public static void main(String[] args) {
		int[] nums = { 1, 1, 2, 2, 3, 3, 4, 4, 8, 8, 9 };

		lowerIndex = 0;
		higherIndex = nums.length - 1;
		Solution obj = new Solution();

		System.out.println(obj.singleNonDuplicate(nums));
	}

	public int singleNonDuplicate(int[] nums) {

		lowerIndex = 0;
		higherIndex = nums.length - 1;

		int middleIndex = (lowerIndex + higherIndex) / 2;
		if (middleIndex % 2 != 0) {
			middleIndex += 1;
		}
		if (middleIndex == higherIndex) {
			if (nums[lowerIndex] == nums[lowerIndex + 1]) {
				return nums[higherIndex];
			} else {
				return nums[lowerIndex];
			}
		} else if (nums[middleIndex] != nums[middleIndex + 1] && nums[middleIndex] != nums[middleIndex - 1]) {
			return nums[middleIndex];
		} else if (nums[middleIndex] != nums[middleIndex + 1] && nums[middleIndex] == nums[middleIndex - 1]) {
			int[] leftArray = Arrays.copyOfRange(nums, lowerIndex, middleIndex + 1);
			return singleNonDuplicate(leftArray);
		} else {
			int[] rightArray = Arrays.copyOfRange(nums, middleIndex + 2, higherIndex + 1);
			return singleNonDuplicate(rightArray);
		}
	}
}
