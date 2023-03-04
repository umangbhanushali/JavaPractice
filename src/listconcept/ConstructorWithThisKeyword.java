package listconcept;

public class ConstructorWithThisKeyword {
	
	String name;
	int age;

	public ConstructorWithThisKeyword(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		ConstructorWithThisKeyword c = new ConstructorWithThisKeyword("Tom", 2);
	  System.out.println(c.name);
	  System.out.println(c.age);
		
	}
}
	
	

