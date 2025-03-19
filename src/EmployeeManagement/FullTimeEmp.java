package EmployeeManagement;

public class FullTimeEmp extends Employee{
	private double basicSalary;
	private double bonus;
	private int LeaveDays;
	public FullTimeEmp(String empname, int empid, String empDept,double basicSal,double bonus,int LeaveDays) 
	{
		super(empname, empid, empDept);
		this.basicSalary=basicSal;
		this.bonus=bonus;
		this.LeaveDays=LeaveDays;
	}
 
	public int getLeaveDays() {
		return LeaveDays;
	}
 
	public void setLeaveDays(int leaveDays) {
		LeaveDays = leaveDays;
	}
 
	@Override
	double calSalary() {
		return basicSalary+bonus;
	}
	@Override
	public boolean applyLeave(int days) {
		if(days>0 && days<=getLeaveDays()) {
			setLeaveDays(getLeaveDays() - days);
			return true;
		}
		return false;
	}

	
 
}






