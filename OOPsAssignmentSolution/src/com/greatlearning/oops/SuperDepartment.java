package com.greatlearning.oops;

public class SuperDepartment {
	private String departmentName="Super Department";
	private String todaysWork="No Work as of now";
	private String workDeadline="Nil";
	private String isTodayAHoliday="Today is not a Holiday";
	
	public SuperDepartment() {
		super();
	}
	
	
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public void setTodaysWork(String todaysWork) {
		this.todaysWork = todaysWork;
	}
	public void setWorkDeadline(String workDeadline) {
		this.workDeadline = workDeadline;
	}
	public void setIsTodayAHoliday(String isTodayAHoliday) {
		this.isTodayAHoliday = isTodayAHoliday;
	}


	public String departmentName() {
		return departmentName;
	}
	public String getTodaysWork() {
		return todaysWork;
	}
	public String getWorkDeadline() {
		return workDeadline;
	}
	public String isTodayAHoliday() {
		return isTodayAHoliday;
	}

}
