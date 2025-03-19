package EmployeeManagement;

public class PartTimei implements employeeInterface {
	 private String empname;
	 private int empId;
	 private String empDept;
	 private double hourlyRate;
		private int hoursWorked ;

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
		public double getHourlyRate() {
			return hourlyRate;
		}
		public void setHourlyRate(double hourlyRate) {
			this.hourlyRate = hourlyRate;
		}
		public int getHoursWorked() {
			return hoursWorked;
		}
		public void setHoursWorked(int hoursWorked) {
			this.hoursWorked = hoursWorked;
		}
		

@Override
public void display() {
	// TODO Auto-generated method stub
	
}
@Override
public double calSalary() {
	// TODO Auto-generated method stub
	return hourlyRate*hoursWorked;
	
} 
@Override
public void Oraniszation() {
	System.out.println("According to the company policy work time:flexible");
}
}