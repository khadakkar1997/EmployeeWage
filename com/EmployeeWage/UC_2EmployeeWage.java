package com.EmployeeWage;

import java.util.Scanner;

public class UC_2EmployeeWage {
	 
	int hours;
	int rate;
	int totalwage;
	
	public void method1(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no of  working hours: " );
		int hours= s.nextInt();  
		
		System.out.println("Enter rate per hour: " );
		int rate= s.nextInt();  
		
		totalwage = hours*rate;
		System.out.println("totalwage: "+totalwage);
		int totalWage= s.nextInt();  
	}
	
	
	
	
	public static void main(String[] args) {
		   
		UC_2EmployeeWage obj = new UC_2EmployeeWage();
		obj.method1();
		
		
}
	}