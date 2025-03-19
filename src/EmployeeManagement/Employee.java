package EmployeeManagement;

abstract class Employee {
	private String empName;
	private int empId;
	private String empDept;
	
	public Employee(String empName,int empId, String empDept)
	{
		super();
		this.empName=empName;
		this.empId=empId;
		this.empDept=empDept;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public void displayEmpDetails()
	{
		System.out.println("emp name:"+empName);
		System.out.println("emp id:"+empId);
		System.out.println("emp dept:"+empDept);

	}
	abstract double calSalary();
	public abstract boolean applyLeave(int days);
	 
}
