package com.EmployeeWage;

import java.util.Scanner;

public class UC_3EmployeeWage {
	
	
	  
	      String employeeName;
	       int hours;
	      
	      int pay;

	      public void setEmployeeName ( String name )
	      {
	          employeeName = name;
	      }
	      public String getEmployeeName()
	      {
	          return employeeName;
	      }
	      
	     int rate = 20;
	      int parttimepay;
	      public double calculatePay( int hours, int rate )
	      {
	          if ( hours <= 8 )
	          { 
	              
	              parttimepay = rate/2;
	          }
	          else pay = hours * rate;

	          return pay;
	      }
	      public void displayEmployee()
	      {
	    	  Scanner s = new Scanner(System.in);
	    	  System.out.println("Employee works part time" + parttimepay);
	    	  int hours= s.nextInt();  
	    	  Scanner s1 = new Scanner(System.in);
	    	  System.out.println("Employee works part time" + pay);
	    	  int pay= s1.nextInt(); 
	    	  
	      }
	  }
