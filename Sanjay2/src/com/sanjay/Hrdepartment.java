package com.sanjay;


public class Hrdepartment extends SuperDepartment{

	  
	    public String departmentName() {
	        return "HR Department";
	    }

	    public String doActivity() {
	        return "Team Lunch";
	    }

	   
	    public String getTodaysWork() {
	        return "Fill today’s timesheet and mark your attendance";
	    }

	
	    public String getWorkDeadline() {
	        return "Complete by EOD";
	    }
}
