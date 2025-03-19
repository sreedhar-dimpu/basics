package EmployeeManagement;

public class FullTimei implements employeeInterface {
	 private String empname;
	 private int empId;
	 private String empDept;
	 private double basicSal;
		private double bonus;

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
		public double getBasicSal() {
			return basicSal;
		}
		public void setBasicSal(double basicSal) {
			this.basicSal = basicSal;
		}
		public double getBonus() {
			return bonus;
		}
		public void setBonus(double bonus) {
			this.bonus = bonus;
		}
	
		@Override
		public void display() {
			// TODO Auto-generated method stub
			
		}
		@Override
		public double calSalary() {
			
          return basicSal*bonus;			
		}
		
		@Override
		public void Oraniszation() {
			System.out.println("According to the company policy work time:9 to 5");
		}
}
