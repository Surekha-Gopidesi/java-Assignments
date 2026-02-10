package instance_task2;

public class Demo {
	boolean b;
	int i;
	String st;
	public String getData(boolean b1,int i1,String st1 ) {
		 b=b1;
		 i=i1;
		 st=st1;
		
		
		return "demo";
	}
	public static void main(String[] args) {
		Demo o1=new Demo();
		Demo o2=new  Demo();
	
		o1.getData(false, 30, "java");
		o2.getData(true, 47, "Spring");
		System.out.println(o1.st+"  " +o2.st);
		
	}

}
