package com.college.app;

import java.util.Scanner;
import com.college.model.*;
import com.college.service.StudentService;

public class MainApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Name :");
		String name=sc.nextLine();
		System.out.println("Enter your Age :");
		int age=sc.nextInt();
		System.out.println("enter your contact Number :");
		long phoneNum=sc.nextLong();
		System.out.println("Enter your Id :");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("enter your Department :");
		String department=sc.nextLine();
		System.out.println("Enter your Course name:");
		String courseName=sc.nextLine();
		System.out.println("Enter your Course fee :");
		double fee=sc.nextDouble();
		Student s1=new Student(id, department, courseName);
		s1.setName(name);
		s1.setAge(age);
		s1.setContactNumber(phoneNum);
		StudentService s2=new StudentService();
		double finalFee=s2.calculateDiscountedFee(fee, department);
		double discount=fee-finalFee;
		s1.dispalyDetails();
		System.out.println("Original fee :"+fee);
		System.out.println("Discount Applied :"+discount);
		System.out.println("Final fee :"+finalFee);
		sc.close();
}
	
}
/**q1)Write a short note on why packages are important in real‑time projects.
 * A)Packages are nothing but a collection of classes, interfaces and sub packages.
 * Packages are very important because of code organized in proper manner.then
 *   implementation is easy without any conflicts.
 *   code readability increases 
 * 
 * q2)Explain why fields must be private and why we use getters and setters.
 * To acheive Encapsulation we must decalre varibles as private and sing public methods
 *  those are getters and setters.
 *  Which is used for when u access private varibles in other classes then then 
 *  fields must be private and why we use getters and setters.
 *  
 *  q3)Explain in your own words how Student inherits properties from Person?
 *  A)By using Extends(IS_A Relation) keyword student class inherits the properties from person.
 *  Student class wants access same data in person class so using extend it happens.
 *  
 *  q4)Write why constructors are required to initialize objects.
 *  A)Constructor is a special type of method it has no return type. when we are initialize the object 
 *  then constructor called automatically because of jvm provides default via super keyword
 *  
 *  
 *  q5)Explain why business logic is written in a separate class.
 *  blc means Business logic class which is separated from the main class .
 *  Blc contains(Methods and variables) and business logic 
 *  we can reuse this logic
 *  
 *  q6)Explain why Scanner is used instead of hard‑coded values.
 *  A)In generally we can can hard core values inside the program but those are  fixed values.
 *  when we want user inputs from the keyboard at the time of runtime we use scanner. 
 *  these are dynamic.
 * */



/**1.What is encapsulation and where is it used in this assignment?
 * A).Encapsulation is nothing but a binding data into single unit.
 * -->Making variables as private and generate public methods those are getters and setters.
 * -->In this assignment we use encapsulation in person class,Student class and course class for accessing private variables in other classes
 * 
 * 2. Why did we create a Person class as a parent class? 
 * A)We create Person as parent because Student class(child) 
 *  acquiring all the properties from Person class(parent). 
 *  
 *  3. How does inheritance reduce code duplication?
 *  A)The main advantage of inheritance is Code re usability.
 *  by using inheritance child class acquiring the all the properties from the parent class.then parent class code accessed
 *  by child class by using extends keyword. 
 *  
 *  4. Why should we not hard‑code values inside programs?
 *  A) In generally we can can hard core values inside the program but those are  fixed values.
 *  when we want user inputs from the keyboard at the time of runtime we use scanner. 
 *  these are dynamic.
 *  
 *  5. Why is project structure important in Java?
 *   A)Project structure important because of code organized in proper manner.then
 *   implementation is easy without any conflicts.
 *   code readability increases 
 *    */
