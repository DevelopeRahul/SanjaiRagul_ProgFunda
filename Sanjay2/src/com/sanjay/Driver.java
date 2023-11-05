package com.sanjay;

public class Driver {
public static void main(String[] args) {
	 SuperDepartment admin = new Admindepartment();
     SuperDepartment hr = new Hrdepartment();
     SuperDepartment tech = new Techdepartment();

     System.out.println("Welcome to " + admin.departmentName());
     System.out.println(admin.getTodaysWork());
     System.out.println(admin.getWorkDeadline());
     System.out.println(admin.isTodayAHoliday());
     
     System.out.println();

     System.out.println("Welcome to " + hr.departmentName());
     System.out.println(((Hrdepartment) hr).doActivity()); 
     System.out.println(hr.getTodaysWork());
     System.out.println(hr.getWorkDeadline());
     System.out.println(hr.isTodayAHoliday());
     
     System.out.println();
     
   
     System.out.println("Welcome to " + tech.departmentName());
     System.out.println(tech.getTodaysWork());
     System.out.println(tech.getWorkDeadline());
     System.out.println(((Techdepartment) tech).getTechStackInformation()); 
     System.out.println(tech.isTodayAHoliday());
	
	
	
}
}
