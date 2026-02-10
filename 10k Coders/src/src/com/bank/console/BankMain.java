package com.bank.console;
import java.util.Scanner;

import com.bank.customers.CustomerAccount;
public class BankMain {

	public static void main(String[] args) {
		CustomerAccount customer=new CustomerAccount("surekha","8522895061","Savings");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Name :");
		String name=sc.nextLine();
		System.out.println("Enter your phone number :");
		String phone=sc.nextLine();
		System.out.println("Enter Account Type :");
		String type=sc.nextLine();
		int choice;
		do {
			System.out.println("\n1.Deposit\n2.withdraw\n3.Activate KYC\n4.view Summary\n5.Exit");
		
		choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Enter amount :");
			customer.deposit(sc.nextDouble());
			break;
		case 2:
			System.out.println("Enter amount :");
			customer.withdraw(sc.nextDouble());
			break;
		case 3:
			customer.activateKYC(type);
			break;
		case 4:
			customer.viewAccountSummary();
			break;
		default:
			System.out.println("exit....");
		}

		}while(choice!=5);

}}
