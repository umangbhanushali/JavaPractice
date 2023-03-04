package javabasics;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		int num = 12;
		int mult;
		
		System.out.println("The Multiplication table for  "  +  num + " is");
		
		for (int i = 1; i <=10; i++) {
			
			mult = num*i;
			System.out.println(num +  " x " + i + " = " + mult );
				
		}
		
		
		
		
		

	}

}
