package javabasics;

public class PrimeNumberInarange {

	public static void main(String[] args) {
		
		int low = 10;
		int high = 100;
		
		
		while (low <= high) {
			boolean flag = false;
			for (int i =2; i<=low/2; i++) {
				if (low % i ==0) {
					flag = true;
					break;
				}	
			}
			if(!flag) {
				System.out.println(low);	
			}
			low++;
		}
	
		
	}

}
