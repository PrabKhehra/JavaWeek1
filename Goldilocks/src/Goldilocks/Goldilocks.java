package Goldilocks;

import java.util.ArrayList;

public class Goldilocks {

	public static void main(String[] args) {
		int[] input = { 100, 80, 30, 50, 130, 75, 90, 60, 150, 85, 120, 70, 200, 200, 110, 100 };
		System.out.println(chairChecker(input));
	}

	public static ArrayList<Integer> chairChecker(int[] input) {
		int numberSeats = input.length;
		int goldWeight = input[0];
		int goldTemp = input[1];
		ArrayList<Integer> suitableChairs = new ArrayList<Integer>();

		for (int i = 2; i < numberSeats; i = i + 2) {
			if (input[i] > goldWeight & input[i + 1] < goldTemp) {
				suitableChairs.add(i / 2);
			}
		}

		return suitableChairs;
	}

}
