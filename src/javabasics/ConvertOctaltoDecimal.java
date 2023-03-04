package javabasics;

public class ConvertOctaltoDecimal {

	public static void main(String[] args) {
	
		int decimal = OctaltoDecimal(116);
		System.out.println(decimal);
		

		
	}
	
	public static int OctaltoDecimal(int octal) {
		int decimal = 0;
		int remainder=0;
		int i = 0;
		while(octal!=0) {
			remainder = octal%10;
			decimal = (int) (decimal + remainder*Math.pow(8, i));
			++i;
			octal=octal/10;
		}
		return decimal;
		
	}

}
