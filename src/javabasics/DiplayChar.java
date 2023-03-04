package javabasics;

public class DiplayChar {

	public static void main(String[] args) {
		
       char ch = 'a';
       char ch1 = 'A';
       
       for (int i = 0; i < 26; i++) {
    	   System.out.print(" " + ch++ + " ");
    	   
	}
       
     System.out.println();
     
       for (int i = 0; i < 26; i++) {
    	   System.out.print(" " + ch1++ + " ");
	}
       
       
	}

}
