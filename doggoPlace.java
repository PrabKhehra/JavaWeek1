public class doggoPlace {

	public static void main(String[] args) {

		dogRes(20);

	}

	{

	}

	public static String dogRes(int x) {

		String ans = "";
		int[] dogPlacements = new int[100];
		for (int i = 0; i <= 99; i++) {
			dogPlacements[i] = i + 1;
		}

		for (int j = 0; j <= 99; j++) {
			if (dogPlacements[j] != x) {
				ans = ans + dogPlacements[j] + "th ";

			} else {
				ans = ans;

			}
		}
		System.out.println(ans);
		return ans;

	}

}
