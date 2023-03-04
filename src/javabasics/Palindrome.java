package javabasics;

public class Palindrome {

	public static void main(String[] args) {
		
		int num = 122;
		int rev = 0;
		
		int actualnum = num;
		
		
		while(num!=0) {
			int n = num%10;
			rev = rev*10 + n;
			num = num/10;
		}
		
		System.out.println("the reverse number is  " + rev);
		
		if (rev==actualnum) {
			System.out.println(" the number is palindrome");
		}else {
			System.out.println(" the number is not palindrom");
		}
	}

}
