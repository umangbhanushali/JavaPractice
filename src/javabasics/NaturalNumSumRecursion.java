package javabasics;

public class NaturalNumSumRecursion {

	public static void main(String[] args) {
		int num = 5;
		int result = addNum(num);
		System.out.println(result);
		
	}

	 public static int addNum(int num) {
		 
		 if(num!=0) {
			 return num + addNum(num-1);
		 }else {
				return num;
		 }
	
		 
	 }
}
