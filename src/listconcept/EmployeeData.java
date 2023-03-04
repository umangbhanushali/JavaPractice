package listconcept;

public class EmployeeData {
	
	private int ssn;
//	private String empname;
	/*
	 * disidisjd dkjsjkdjksjd jhdjshd
	 */
	private String empname;
	

	public int getSsn() {
		return ssn;
	}


	public void setSsn(int ssn) {
		this.ssn = ssn;
	}


	public String getEmpname() {
		return getEmpname();
	}


	public void setEmpname(String empname) {
		this.empname = empname;
	}


	public static void main(String[] args) {
		EmployeeData emp = new EmployeeData();
		emp.setSsn(124533);
		emp.setEmpname("Peter");
	
		System.out.println("Employee ssn is  " + emp.getSsn());
		System.out.println("Employee name is  " + emp.getEmpname());
	}

}
