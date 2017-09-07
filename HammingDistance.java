
public class HammingDistance {

	public static void main(String[] args) {

		int x = 8;
		int y = 9;

		int hammingDistance = intToBinary(x, y);
		System.out.println(hammingDistance);
	}

	public static int intToBinary(int x, int y) {

		String binaryNumber = "";
		int counter = 0;

		if (x > y) {
			while (x > 0) {
				int tempX = x % 2;
				int tempY = y % 2;

				if (tempX != tempY)
					counter++;

				// binaryNumber = String.valueOf(temp) + binaryNumber;
				x = x / 2;
				y = y / 2;
			}
		} else if (x < y) {
			while (y > 0) {
				int tempX = x % 2;
				int tempY = y % 2;

				if (tempX != tempY)
					counter++;

				// binaryNumber = String.valueOf(temp) + binaryNumber;
				x = x / 2;
				y = y / 2;
			}
		} else
			return 0;

		return counter;
	}
}
