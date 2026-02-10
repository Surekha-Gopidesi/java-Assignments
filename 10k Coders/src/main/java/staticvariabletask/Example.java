package staticvariabletask;

public class Example {
	      static int a=20;
	      static int b=30;
	  public static void  sum(){
	       int add= a+b;
	      System.out.println(a+b);
	}
	  public static void average(){
	     sum();
	      int avg=(a+b)/2;
	   System.out.println(avg);
	}
	  public static void main(String [] args){
	       average();
	}
	}


