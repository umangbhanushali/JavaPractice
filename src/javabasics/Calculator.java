package javabasics;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner (System.in);
		
		System.out.println(" Please enter two numbers ");
		
		double first = reader.nextDouble();
		double second = reader.nextDouble();
		double result = 0;


		System.out.println(" Please enter an operator  (+,-,*, /) ");
		char operator = reader.next().charAt(0);
		
		switch (operator) {
		case '+':
			result = first + second;
			break;
			
		case '-':
			result = first - second;
			break;
			
			
		case '*':
			result = first*second;
			break;
			
		case '/':
			result = first/second;
			break;

		default:
			System.out.println(" Please enter correct operator ");
			break;
		}
		
		System.out.println(result);
	}

}
