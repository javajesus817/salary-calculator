package com.salarycalculator.main;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class InheritanceActivity {
	private static Manager man1;
	private static Trainee train1;
	private static DecimalFormat df2;
	

	public static void main(String[] args) {
		man1 = new Manager(126534, "Peter", "Chennai, India", 237844L, 65000);
		train1 = new Trainee(29846, "Jack", "Mumbai, India", 442085L, 45000);
		df2 = new DecimalFormat("#.00");
		df2.setRoundingMode(RoundingMode.HALF_UP);
		
		System.out.println("Manager...");
		System.out.println("Employee ID: " + man1.getEmployeeId());
		System.out.println("Employee Name: " + man1.getEmployeeName());
		System.out.println("Employee Address: " + man1.getEmployeeAddress());
		System.out.println("Employee Phone: " + man1.getEmployeePhone());
		System.out.println("Employee Basic Salary: " + df2.format(man1.getBasicSalary()));
		System.out.println("Calculated salary: $" + df2.format(man1.calculateSalary()));
		System.out.println("Transportation Allowance: $" + df2.format(man1.calculateTransportAllowance()));
		
		System.out.println();
		System.out.println("Trainee...");
		System.out.println("Employee ID: " + train1.getEmployeeId());
		System.out.println("Employee Name: " + train1.getEmployeeName());
		System.out.println("Employee Address: " + train1.getEmployeeAddress());
		System.out.println("Employee Phone: " + train1.getEmployeePhone());
		System.out.println("Employee Basic Salary: " + df2.format(train1.getBasicSalary()));
		System.out.println("Calculated salary: $" + df2.format(train1.calculateSalary()));
		System.out.println("Transportation Allowance: $" + df2.format(train1.calculateTransportAllowance()));
	}

}
