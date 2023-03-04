package javabasics;

public class CalculatePower {

	public static void main(String[] args) {
		
		int base = 8;
		int exp = 4;
		
		long result = 1;
		
		while (exp !=0) {
			result *= base;
			--exp;
			
		}
		
		System.out.println(result);
	}

}

