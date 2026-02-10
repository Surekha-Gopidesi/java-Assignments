package instance_task2;

public class Patient {
	
			static String HospitalName;
			String patientName;
			int age;
			public void printDetails() {
				System.out.println("Hospital Name: "+HospitalName);
				System.out.println("Patient Name: "+patientName);
				System.out.println("Patient age: "+age);
				System.out.println("--------------------");
			}
			public static void main(String[] args) {
				Patient.HospitalName="City care Hospital";
				Patient p1=new Patient();
				p1.patientName="John Doe";
				p1.age=45;
				p1.printDetails();
				
				Patient p2=new Patient();
				p2.patientName="Emma Watson";
				p2.age=30;
				p2.printDetails();
				
				
				
			}

		}






