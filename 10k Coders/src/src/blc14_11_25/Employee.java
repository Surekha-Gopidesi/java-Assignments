package blc14_11_25;

public class Employee {

	int empid;
	String empName;
	double salary;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int Empid) {
		empid = Empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String EmpName) {
		empName = EmpName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double Salary) {
		salary = Salary;
	}
	public static Employee getEmployeeDetails() {
		Employee e1=new Employee();
		e1.setEmpid(101);
		e1.setEmpName("Surekha");
		e1.setSalary(50000.0);
		return e1;
	}
	
}
