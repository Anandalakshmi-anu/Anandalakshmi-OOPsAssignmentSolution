package com.greatlearning.oops.tech;

import com.greatlearning.oops.SuperDepartment;

public class TechDepartment extends SuperDepartment {
	private String departmentName="Tech Department";
	private String todaysWork="Complete coding of Module 1";
	private String workDeadline="Complete by EOD";
	private String techStackInformation ="Core Java";
	
	public TechDepartment() {
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
	public void setTechStackInformation(String techStackInformation) {
		this.techStackInformation = techStackInformation;
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
	public String getTechStackInformation () {
		return techStackInformation;
	}


	@Override
	public String toString() {
		return "Welcome to " + departmentName() + "\n" + getTodaysWork()
				+ "\n" + getWorkDeadline() + "\n" + getTechStackInformation() + "\n" + isTodayAHoliday() 
				+ "\n";
	}	

}
