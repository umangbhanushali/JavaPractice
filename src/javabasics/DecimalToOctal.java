package javabasics;

public class DecimalToOctal {

	public static void main(String[] args) {
		int octalnumber = DecimaltoOctal(109);
		System.out.println(octalnumber);

	}

	 public static int DecimaltoOctal(int decimal) {
		 int octal = 0;
		 int i = 1;
		 int remainder = 0;
		 while (decimal!=0) {
			 remainder = decimal%8;
			 decimal= decimal/8;
			 octal = octal + remainder*i;
			 i = i*10;
		 }
		 return octal;
	 }
}
