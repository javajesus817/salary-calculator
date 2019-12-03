package com.salarycalculator.main;

public class Employee {
	private long employeeId;
	private String employeeName;
	private String employeeAddress;
	private Long employeePhone;
	private double basicSalary;
	private double specialAllowance = 250.8d;
	private double hra = 1000.5d;
	
	public Employee() {
		
	}

	public Employee(long employeeId, String employeeName, String employeeAddress, Long employeePhone, double basicSalary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeePhone = employeePhone;
		this.basicSalary = basicSalary;
	}

	protected long getEmployeeId() {
		return employeeId;
	}

	protected void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	protected String getEmployeeName() {
		return employeeName;
	}

	protected void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	protected String getEmployeeAddress() {
		return employeeAddress;
	}

	protected void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	protected Long getEmployeePhone() {
		return employeePhone;
	}

	protected void setEmployeePhone(Long employeePhone) {
		this.employeePhone = employeePhone;
	}

	protected double getBasicSalary() {
		return basicSalary;
	}

	protected void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	protected double getSpecialAllowance() {
		return specialAllowance;
	}

	protected void setSpecialAllowance(double specialAllowance) {
		this.specialAllowance = specialAllowance;
	}

	protected double getHra() {
		return hra;
	}

	protected void setHra(double hra) {
		this.hra = hra;
	}
	
	protected double calculateSalary() {
		double salary = this.basicSalary + (this.basicSalary * (this.specialAllowance / 100)) + (this.basicSalary * (this.hra / 100));
		
		return salary;
	}
	
	protected double calculateTransportAllowance() {
		double transportAllowance = (10d/100d) * this.basicSalary;
		
		return transportAllowance;
	}
	
}
