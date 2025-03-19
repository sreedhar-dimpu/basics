package employeeManagementSystem;

public class ManagerEmployee extends FullTimeEmployee implements BonusPercentage {
	 
	public ManagerEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
 
	public ManagerEmployee(String empname, int empId, String empDept, double basicSalary, int leaveDays, double bonus) {
		super(empname, empId, empDept, basicSalary, leaveDays, bonus);
		// TODO Auto-generated constructor stub
	}
 
	@Override
	public double calSalary(double baseSalary) {
		// TODO Auto-generated method stub
		return baseSalary *Bonus_Percentage;
	}
 
}
