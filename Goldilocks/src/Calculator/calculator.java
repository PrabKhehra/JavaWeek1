package Calculator;

public class calculator {

	public static void main(String[] args) {
		int[] numberString = { 1, 1, 2 };
		if (numberString.length == 3) {
			print3(numberString);
		} else if (numberString.length == 4) {
			print4(numberString);
		} else {
			System.out.println("Can only do calculations with 3 or 4 numbers!");
		}

	}

	public static void print4(int[] numbers) {
		System.out.println(addAdd(numbers));
		System.out.println(multMult(numbers));
		System.out.println(addMult(numbers));
	}

	public static void print3(int[] numbers) {
		System.out.println(addition(numbers));
		System.out.println(multiplication(numbers));
	}

	public static String addition(int[] numb) {
		if (numb[1] + numb[2] == numb[0]) {
			return numb[1] + "+" + numb[2] + "=" + numb[0];
		} else if (numb[1] + numb[0] == numb[2]) {
			return numb[1] + "+" + numb[0] + "=" + numb[2];
		} else if (numb[0] + numb[1] == numb[1]) {
			return numb[0] + "+" + numb[2] + "=" + numb[1];
		}
		return "no additions";
	}

	public static String multiplication(int[] numb) {
		if (numb[1] * numb[2] == numb[0]) {
			return numb[1] + "*" + numb[2] + "=" + numb[0];
		} else if (numb[1] * numb[0] == numb[2]) {
			return numb[1] + "*" + numb[0] + "=" + numb[2];
		} else if (numb[0] * numb[2] == numb[1]) {
			return numb[0] + "*" + numb[2] + "=" + numb[1];
		}
		return "no multiplications";
	}

	public static String addAdd(int[] numb) {
		if (numb[0] + numb[1] == numb[2] + numb[3]) {
			return numb[0] + "+" + numb[1] + "=" + numb[2] + "+" + numb[3];
		} else if (numb[0] + numb[2] == numb[1] + numb[3]) {
			return numb[0] + "+" + numb[2] + "=" + numb[1] + "+" + numb[3];
		} else if (numb[0] + numb[3] == numb[1] + numb[2]) {
			return numb[0] + "+" + numb[3] + "=" + numb[1] + "+" + numb[2];
		}
		return "no double additions";
	}

	public static String addMult(int[] numb) {
		if (numb[0] + numb[1] == numb[2] * numb[3]) {
			return numb[0] + "+" + numb[1] + "=" + numb[2] + "*" + numb[3];
		} else if (numb[0] + numb[2] == numb[1] * numb[3]) {
			return numb[0] + "+" + numb[2] + "=" + numb[1] + "*" + numb[3];
		} else if (numb[0] + numb[3] == numb[1] * numb[2]) {
			return numb[0] + "+" + numb[3] + "=" + numb[1] + "*" + numb[2];
		} else if (numb[1] + numb[2] == numb[0] * numb[3]) {
			return numb[1] + "+" + numb[2] + "=" + numb[0] + "*" + numb[3];
		} else if (numb[1] + numb[3] == numb[0] * numb[2]) {
			return numb[1] + "+" + numb[3] + "=" + numb[0] + "*" + numb[2];
		} else if (numb[2] + numb[3] == numb[0] * numb[1]) {
			return numb[2] + "+" + numb[3] + "=" + numb[0] + "*" + numb[1];
		}
		return "no additions/multiplications";
	}

	public static String multMult(int[] numb) {
		if (numb[0] * numb[1] == numb[2] * numb[3]) {
			return numb[0] + "*" + numb[1] + "=" + numb[2] + "*" + numb[3];
		} else if (numb[0] * numb[2] == numb[1] * numb[3]) {
			return numb[0] + "*" + numb[2] + "=" + numb[1] + "*" + numb[3];
		} else if (numb[0] * numb[3] == numb[1] * numb[2]) {
			return numb[0] + "*" + numb[3] + "=" + numb[1] + "*" + numb[2];
		}
		return "no double multiplications";
	}
}