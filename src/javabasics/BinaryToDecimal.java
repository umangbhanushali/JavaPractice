package javabasics;

public class BinaryToDecimal {

	public static void main(String[] args) {
		long num = 1001001;
		int decimal = BinarytoDecimal(num);
		System.out.println(decimal);
		
		
	}

	 public static int BinarytoDecimal(long num) {
		 
		 int  decimalnumber=0;
		int i = 0;
		 long remainder = 0;
		 while(num!=0) {
			 remainder= num%10;
			 decimalnumber =  (int) (decimalnumber + remainder*Math.pow(2,i));
			 num = num/10;
			 i++;
		 }
		 
		 return  decimalnumber;
		 
		 
	
		 
	 }
}
