package EmployeeManagement;
public class internsi implements employeeInterface {
	 private String empname;
	 private int empId;
	 private String empDept;
	 private double stipend;

		public internsi() {
		super();
		// TODO Auto-generated constructor stub
	}
		public internsi(String empname, int empId, String empDept, double stipend) {
		super();
		this.empname = empname;
		this.empId = empId;
		this.empDept = empDept;
		this.stipend = stipend;
	}
		public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public double getStipend() {
		return stipend;
	}
	public void setStipend(double stipend) {
		this.stipend = stipend;
	}
		
		@Override
		public void display() {
			// TODO Auto-generated method stub
			
		}
		@Override
		public double calSalary() {
			// TODO Auto-generated method stub
			return stipend;
		}
		@Override
		public void Oraniszation() {
			System.out.println("According to the company policy work time:10 to 4");
		}
}