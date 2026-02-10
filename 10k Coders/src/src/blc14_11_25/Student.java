package blc14_11_25;

public class Student {
	int id;
	int rollno;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int Id) {
		id = Id;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int Rollno) {
		rollno = Rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String Name) {
		name = Name;
	}
	public static Student getStudentDetails(int id,int rollno,String name) {
		Student s1=new Student();
		s1.setId(52);
		s1.setRollno(43);
		s1.setName("Surekha");
		return s1;
		
	}
	
	

}
