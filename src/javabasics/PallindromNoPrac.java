package javabasics;

public class PallindromNoPrac {
	public static void main(String[] args) {
		int num = 121;
		int rev= 0;
		int actualnum = num;
		
		while (num>0) {
			int n = num%10;
			rev = rev*10 + n;
			num = num/10;
		
	}
		
		System.out.println("the rev number is " + rev);
		if (rev==actualnum) {
			System.out.println("the number is pallindrome" );
		}
		 else {
			System.out.println("the number is not a pallindrome");

		}

}
}
