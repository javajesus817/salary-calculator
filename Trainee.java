package com.salarycalculator.main;

public class Trainee extends Employee {
	private long employeeId;
	private String employeeName;
	private String employeeAddress;
	private Long employeePhone;
	private double basicSalary;
	private double specialAllowance;
	private double hra;
	
	public Trainee() {
		
	}
	
	public Trainee(long employeeId, String employeeName, String employeeAddress, Long employeePhone, double basicSalary) {
		super(employeeId, employeeName, employeeAddress, employeePhone, basicSalary);
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
	

}
