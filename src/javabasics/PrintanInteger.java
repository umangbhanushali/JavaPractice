package javabasics;

import java.util.Scanner;

public class PrintanInteger {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("plz enter a number");
		
		int num = reader.nextInt();
		
		System.out.println("the number entererd is " + num);
		
	}

}