
public class RevFactorial {
	public static void main(String[] args) {
		revFactorial(362880);
		revFactorial(479001600);
		revFactorial(6);
		revFactorial(18);
		revFactorial(39916800);
		revFactorial(39916799);
		revFactorial(39916801);

	}

	public static String revFactorial(int x) {
		int ans = x;
		int counter = 1;
		int a = 2;
		if (x == 0) {
			System.out.println("0=1!");
			return "0=1!";
		} else {

			while (x != 1) {
				if (x % a == 0) {
					x = x / a;
					a = a + 1;
					counter = counter + 1;

				} else {
					System.out.println("" + ans + " NONE");
					return "NONE";
				}

			}
		}
		System.out.println("" + ans + " = " + counter + "!");
		return ("Factorial:" + counter + "!");

	}

}
