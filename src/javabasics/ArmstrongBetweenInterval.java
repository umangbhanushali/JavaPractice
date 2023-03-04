package javabasics;

public class ArmstrongBetweenInterval {

	public static void main(String[] args) {
		
		int low = 100;
		int high = 400;
		double result = 0;
		
		while (low!=0 && low<= high) {
				int n = low%10;
				result = result + Math.pow(n,3);
				low = low/10;
				System.out.print(low + " ");
				low++;
		
				
			}
	
		
		}
		
		

	}


