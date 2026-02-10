
public class Example {
	String empName;
	String empDesg;
	double empSalary;
	int EmpId;
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empname) {
		empName = empname;
	}

	public String getEmpDesg() {
		return empDesg;
	}

	public void setEmpDesg(String empdesg) {
		empDesg = empdesg;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empsalary) {
		empSalary = empsalary;
	}

	public int getEmIid() {
		return EmpId;
	}

	public void setEmpId(int empid) {
		EmpId = empid;
	}


	public static void main(String[] args) {
		Example e1=new Example();
		e1.setEmpName("Surekha");
		System.out.println(e1.getEmpName());
		e1.setEmpDesg("java Developer");
		System.out.println(e1.getEmpDesg());
		e1.setEmpSalary(50000);
		System.out.println(e1.getEmpSalary());
		e1.setEmpId(1);
		System.out.println(e1.getEmIid());
		
	

	}

}
