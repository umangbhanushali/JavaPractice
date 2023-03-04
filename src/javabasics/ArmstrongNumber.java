package javabasics;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int num = 153;
		int actualnum = num;
		double result = 0;
		
		while (num!=0) {
			int n = num%10;
			result = result + Math.pow(n, 3);
			num = num/10;
		}

		if (result==actualnum) {
			System.out.println("its an armstrong number");
		}else {
			System.out.println("its not an armstrong number");
		}
	}

}
