package javabasics;

public class LargestAmongThreeNumbers {

	public static void main(String[] args) {

		int x = 500;
		int y = 200;
		int z = 300;

		if (x > y && x > z) {
			System.out.println("x is  greatest");
		} else if (y > z) {
			System.out.println("y is greatest");
		} else {
			System.out.println("z is greatest");
		}

	}
}
