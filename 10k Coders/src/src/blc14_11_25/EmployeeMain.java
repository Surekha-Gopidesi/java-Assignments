package blc14_11_25;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee obj=Employee.getEmployeeDetails();
		System.out.println(obj.getEmpid());
		System.out.println(obj.getEmpName());
		System.out.println(obj.getSalary());

	}

}
