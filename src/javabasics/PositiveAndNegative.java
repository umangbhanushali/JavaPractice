package javabasics;

import java.util.Scanner;

public class PositiveAndNegative {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("please enter the number");
		
		int num = reader.nextInt();
		if (num>0) {
			System.out.println("Its a positive number");
		} else {
			System.out.println("Its a negative number");
		}
		
		

	}

}
