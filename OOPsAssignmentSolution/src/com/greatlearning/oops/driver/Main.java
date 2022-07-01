package com.greatlearning.oops.driver;

import com.greatlearning.oops.admin.AdminDepartment;
import com.greatlearning.oops.hr.HrDepartment;
import com.greatlearning.oops.tech.TechDepartment;

public class Main {

	public static void main(String[] args) {
		AdminDepartment adminDepartment=new AdminDepartment();
		System.out.println(adminDepartment.toString());
		
		HrDepartment hrDepartment=new HrDepartment();
		System.out.println(hrDepartment.toString());
		
		TechDepartment techDepartment=new TechDepartment();
		System.out.println(techDepartment.toString());
	}

}
