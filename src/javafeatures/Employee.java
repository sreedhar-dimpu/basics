package javafeatures;

public class Employee {
	private String name;
	private int empID;
	public Employee(String name) {
		this.name = name;
		System.out.println("Employee Created "+name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpID() {
		return empID;
	}
//	public void setEmpID(String empID) {
//		this.empID = empID;
//		this.name=name;
//	}

	public Employee(String name, Integer id) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.empID = id;
	}

 
}
