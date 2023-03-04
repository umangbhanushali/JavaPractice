package javabasics;

public class LeapYear {

	public static void main(String[] args) {
		
		int year = 2015;
		
		if (year% 4==0) {
			if (year%100 == 0) {
				if (year%400 == 0) {
					System.out.println("its a century leap year");
				}
				else {
					System.out.println("its not a leap year");
				}
				
			}
			else {
				System.out.println("its a leap year");
			}
		}
		else {
			System.out.println("its not a leap year");
		}

	}

}
