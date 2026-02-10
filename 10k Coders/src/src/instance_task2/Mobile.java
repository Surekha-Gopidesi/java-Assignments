package instance_task2;

public class Mobile {
	
		static String storeName;
		String brand;
		int price;
		public void showDetails() {
			System.out.println("Store Name: "+storeName);
			System.out.println("Mobile Brand: "+brand);
			System.out.println("Mobile Price: "+price);
			System.out.println("--------------------");
		}
		public static void main(String[] args) {
			Mobile.storeName="Tech World ";
			Mobile mob=new Mobile();
			
			mob.brand="Apple";
			mob.price=1200;
			mob.showDetails();
			
			Mobile mob1=new Mobile();
			
			mob1.brand="samsung";
			mob1.price=900;
			mob1.showDetails();
			
		}

	}



