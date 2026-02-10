package blc14_11_25;

public class StudentMain {

	public static void main(String[] args) {
		Student obj=Student.getStudentDetails(52,27, "Surekha");
		System.out.println(obj.getId());
		System.out.println(obj.getRollno());
		System.out.println(obj.getName());

	}

}
