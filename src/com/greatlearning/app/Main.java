package com.greatlearning.app;

import com.greatlearning.package2.AdminDepartment; // importing com.greatlearning.package2 package to access AdminDepartment class
import com.greatlearning.package3.HrDepartment; // importing com.greatlearning.package package to access HrDepartment class
import com.greatlearning.package4.TechDepartment; // com.greatlearning.package4 package to access TechDepartment class

class Main{ // Driver class
	public static void main(String args[]) {
		String s; // to store string statements
		HrDepartment hr = new HrDepartment(); // object of HrDepartment class
		AdminDepartment admin = new AdminDepartment(); // object of AdminDepartment class
		TechDepartment tech= new TechDepartment(); // object of TechDepartment class
		
		System.out.println(s = admin.departmentName()); // calling departmentName function of AdminDepartment class and storing the string value in s variable of string type and printing the return statement through s variable
	    System.out.println(s = admin.getTodaysWork()); // calling getTodaysWork function of AdminDepartment class and storing the string value in s variable of string type and printing the return statement through s variable
	    System.out.println(s = admin.getWorkDeadline()); // calling getWorkDeadline function of AdminDepartment class and storing the string value in s variable of string type and printing the return statement through s variable
	    System.out.println(s = admin.isTodayAHoliday()); // calling isTodayAHoliday function of SuperDepartment class with the of object of AdminDepartment class and storing the string value in s variable of string type and printing the return statement through s variable
	    System.out.println("\n"); // to change the line
		
		System.out.println(s = hr.departmentName()); // calling departmentName function of HrDepartment class and storing the string value in s variable of string type and printing the return statement through s variable
		System.out.println(s = hr.doActivity()); // calling doActivity function of HrDepartment class and storing the string value in s variable of string type and printing the return statement through s variable
		System.out.println(s = hr.getTodaysWork()); // calling getTodaysWork function of HrDepartment class and storing the string value in s variable of string type and printing the return statement through s variable
		System.out.println(s = hr.getWorkDeadline()); // calling getWorkDeadline function of HrDepartment class and storing the string value in s variable of string type and printing the return statement through s variable		
		System.out.println(s = hr.isTodayAHoliday()); // calling isTodayAHoliday function of SuperDepartment class with the of object of HrDepartment class and storing the string value in s variable of string type and printing the return statement through s variable
		
	    System.out.println("\n"); // to change the line
		
		System.out.println(s = tech.departmentName()); // calling departmentName function of TechDepartment class and storing the string value in s variable of string type and printing the return statement through s variable	
		System.out.println(s = tech.getTodaysWork()); // calling getTodaysWork function of TechDepartment class and storing the string value in s variable of string type and printing the return statement through s variable	
		System.out.println(s = tech.getWorkDeadline()); // calling getWorkDeadline function of TechDepartment class and storing the string value in s variable of string type and printing the return statement through s variable	
		System.out.println(s = tech.getTechStackInformation()); // calling getTechStackInformation function of TechDepartment class and storing the string value in s variable of string type and printing the return statement through s variable	
		System.out.println(s = tech.isTodayAHoliday()); // calling isTodayAHoliday function of SuperDepartment class with the of object of TechDepartment class and storing the string value in s variable of string type and printing the return statement through s variable
		
	}
}