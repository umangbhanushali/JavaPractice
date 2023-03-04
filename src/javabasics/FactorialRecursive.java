package javabasics;

public class FactorialRecursive {

	public static void main(String[] args) {
		int num =0;
		int fact = multiplyNum(num);
		System.out.println(fact);

	}

	public static int multiplyNum(int num) {
		if (num!=0) {
			return num* multiplyNum(num-1);
		}
		return 1;
	}
}
