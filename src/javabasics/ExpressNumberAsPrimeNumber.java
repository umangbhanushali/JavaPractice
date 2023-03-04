package javabasics;

public class ExpressNumberAsPrimeNumber {

	public static void main(String[] args) {
		
		int num = 17;
		boolean flag = false;
		
		for (int i = 2; i<=num/2; i++) {
			if (checkPrimeNumber(i)) {
				if(checkPrimeNumber(num-i)) {
					System.out.println(num + " = " + i + " + " + (num-i));
					flag= true;
				}	
			}
		}
		
		if(!flag) {
			System.out.println(num + " cannot be expressed as a prime number");
		}
		
	}

	public static boolean checkPrimeNumber(int num) {
	       boolean isPrime = true;
		for (int i = 2; i<=num/2; i++) {
			if (num%i==0) {
			isPrime = false;
			break;
				
			}
			
		}
		return isPrime;
	
		
		
	}
}
