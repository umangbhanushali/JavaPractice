package javabasics;

import java.util.Scanner;

public class NumberofDigits {

	public static void main(String[] args) {
		
		long num = 454645545454545446l;
		int count = 0;
		
		while (num !=0) {
			num = num/10;
			++count;
			
		}
		
		System.out.println("the no of digits are  " + count);
		
	}

}
