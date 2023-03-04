package listconcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList ar  = new ArrayList();
 
		ar.add(30);
		ar.add(10);
		ar.add(20);
	
		
		System.out.println(ar.size());;
		
		for (int i=0;i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
	

	 Employee e1 = new Employee("Nav",27,"CS");
	 Employee e2 = new Employee("meet",25,"Hardware");
	 Employee e3 = new Employee("Um",24,"Software");
	 
	ArrayList <Employee> ar1 = new ArrayList<Employee>();

	ar1.add(e1);
	ar1.add(e2);
	ar1.add(e3);
	
	
	Iterator<Employee> it = ar1.iterator();
	while (it.hasNext()) {
		Employee emp = it.next();
		System.out.println(emp.name);
		System.out.println(emp.dept);
		System.out.println(emp.age);
	
	}
	 


}
}
