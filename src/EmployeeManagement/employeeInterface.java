package EmployeeManagement;
public interface employeeInterface{
	void display();
	double calSalary();
	
	
	default void Oraniszation() {
		System.out.println("According to the company policy work time:9 to 5");
	}
	static void companyTagLine() {
		System.out.println("taging......");
	}
}
