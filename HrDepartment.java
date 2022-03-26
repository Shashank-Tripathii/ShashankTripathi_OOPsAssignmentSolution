package com.greatlearning.package3;
import com.greatlearning.package1.*;

public class HrDepartment extends SuperDepartment{
	
	public String departmentName()
	{
		return "Welcome to Hr Department ";
	}
	public String getTodaysWork()
	{
		return "Fill today’s worksheet and mark your attendance";
	}
	
	public String getWorkDeadline()
	{
		return "Complete by EOD ";
	}
	public String doActivity()
	{
		return "team Lunch";
	}
}