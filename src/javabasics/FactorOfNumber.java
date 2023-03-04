package javabasics;

public class FactorOfNumber {

	public static void main(String[] args) {
		
		int num = 60;
	
		
		for (int i = 1; i <=num; i++) {
			
			if (num % i==0) {
				System.out.println("the factor of  " + num + "  is  " + i);
			}
			
		}
		
		
	}

}

