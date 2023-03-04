package javabasics;

public class ICICI implements US, Canada {

	public static void main(String[] args) {
		
		ICICI i = new ICICI();
		i.credit();
		i.debit();
		i.carloan();
		i.homeloan();

	}

	@Override
	public void credit() {
		
		System.out.println("print credit statement");
		
	}

	@Override
	public void debit() {
		System.out.println("print debit statement");
		
	}

	@Override
	public void carloan() {
		
		
	}

	@Override
	public void homeloan() {
		// TODO Auto-generated method stub
		
	}

}
