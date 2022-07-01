package com.greatlearning.oops.hr;

import com.greatlearning.oops.SuperDepartment;

public class HrDepartment extends SuperDepartment {
	private String departmentName="HR Department";
	private String todaysWork="Fill today’s timesheet and mark your attendance";
	private String workDeadline="Complete by EOD";
	private String doActivity="team Lunch";
	
	public HrDepartment() {
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
	public void setDoActivity(String doActivity) {
		this.doActivity = doActivity;
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
	public String doActivity() {
		return doActivity;
	}


	@Override
	public String toString() {
		return "Welcome to " + departmentName() + "\n"  + doActivity() + "\n" + getTodaysWork()
				+ "\n" + getWorkDeadline() + "\n" + isTodayAHoliday() + "\n";
	}

}
