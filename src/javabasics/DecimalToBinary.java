package javabasics;

public class DecimalToBinary {

	public static void main(String[] args) {
		long num = 153;
	    long binary =  DecimaltoBinary(num);
	    System.out.println(binary);
				
 
	}

	public static long DecimaltoBinary(long num) {
	 
		long binarynumber=0;
		long remainder = 1;
		int i=1;
		while (num!=0) {
			remainder = num % 2;
			
			binarynumber+= remainder*i;
	        i = i*10;	
	        num = num/2;
	      
		}
		   return binarynumber;
	
	}
	
}
