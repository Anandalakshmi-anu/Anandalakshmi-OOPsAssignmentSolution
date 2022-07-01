package com.greatlearning.oops.admin;

import com.greatlearning.oops.SuperDepartment;

public class AdminDepartment extends SuperDepartment {
	private String departmentName="Admin Department";
	private String todaysWork="Complete your documents Submission";
	private String workDeadline="Complete by EOD";
	
	public AdminDepartment() {
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
	
	
	public String departmentName() {
		return departmentName;
	}
	public String getTodaysWork() {
		return todaysWork;
	}
	public String getWorkDeadline() {
		return workDeadline;
	}


	@Override
	public String toString() {
		return "Welcome to " + departmentName() + "\n" + getTodaysWork()
				+ "\n" + getWorkDeadline() + "\n" + isTodayAHoliday() + "\n";
	}
	
}
