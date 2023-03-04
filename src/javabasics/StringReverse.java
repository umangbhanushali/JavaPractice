package javabasics;

public class StringReverse {

	public static void main(String[] args) {
	
		
		String s = "Umang Bhanushali";
		
		int len = s.length();
		
		String rev= " ";
		
		for (int i=(len-1); i>=0; i--) {
			
		rev = rev + s.charAt(i);
		
		}
		System.out.println(rev);
		StringBuffer u = new StringBuffer(s);
		
		System.out.println(u.reverse());
		
 		
		
		
		
		

	}

}
