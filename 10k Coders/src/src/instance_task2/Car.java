package instance_task2;

public class Car {
	static String showroomName;
	String  modelName;
	int price;
	public void displayDetails() {
		System.out.println("Showroom Name: "+showroomName);
		System.out.println("Car model: "+modelName);
		System.out.println("Car Price: "+price);
		System.out.println("---------------------------");
	}
	public static void main(String[] args) {
		Car obj1=new Car();
		Car obj2=new Car();
		obj1.modelName="BMW";
		obj1.price=800000;
		obj1.showroomName="Elite Motors";
		obj1.displayDetails();
		obj2.modelName="tesla Model S";
		obj2.price=700000;
		obj2.displayDetails();
		
	}

}
