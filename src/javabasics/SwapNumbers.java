package javabasics;

public class SwapNumbers {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println("*******before swapping*************");
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("*******after swapping************");
		
		int temp;
		
		temp = a;
		a = b;
		b = temp;
		
		
		System.out.println(a);
		System.out.println(b);
	}

}
