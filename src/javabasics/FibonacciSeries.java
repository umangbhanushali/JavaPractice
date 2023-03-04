package javabasics;

import java.util.Iterator;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num = 15;
		int t1 = 0;
		int t2 = 1;
		
		
		for (int i = 1; i < num ; i++) {
			
			System.out.print( " " + (t1) + " "); //0
			int sum = t1+t2; //1
			t1=t2;//1
			t2=sum;//1
			
			
			
		}
		
	}

}
