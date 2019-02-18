package com.cg.payroll.beans;
public class Associate {
	private int associateId;
	private int YearlyInvestmentUnder8oC;
	private String firstName, lastName,department,designation,pancard,emailId;
	private Salary salary;
	private BankDetails bankDetails;
	public Associate(int associateId, int YearlyInvestmentUnder8oC, String firstName, String lastName,
			String department, String designation, String pancard, String emailId) {
		super();
		this.associateId = associateId;
		this.YearlyInvestmentUnder8oC = YearlyInvestmentUnder8oC;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.designation = designation;
		this.pancard = pancard;
		this.emailId = emailId;
	}
	public Associate(int YearlyInvestmentUnder8oC, String firstName, String lastName, String department,
			String designation, String pancard, String emailId, Salary salary, BankDetails bankDetails) {
		super();
		this.YearlyInvestmentUnder8oC = YearlyInvestmentUnder8oC;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.designation = designation;
		this.pancard = pancard;
		this.emailId = emailId;
		this.salary = salary;
		this.bankDetails = bankDetails;
	}
	
	
	
	public Associate(int associateId, int yearlyInvestmentUnder80C, String firstName, String lastName,
			String department, String designation, String pancard, String emailId, Salary salary,
			BankDetails bankDetails) {
		super();
		this.associateId = associateId;
		YearlyInvestmentUnder8oC = yearlyInvestmentUnder80C;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.designation = designation;
		this.pancard = pancard;
		this.emailId = emailId;
		this.salary = salary;
		this.bankDetails = bankDetails;
	}
	public int getassociateId() {
		return associateId;
	}
	public void setassociateId(int associateId) {
		this.associateId = associateId;
	}
	public int getyearlyInvestmentUnder8oC() {
		return YearlyInvestmentUnder8oC;
	}
	public void setyearlyInvestmentUnder8oC(int YearlyInvestmentUnder8oC) {
		this.YearlyInvestmentUnder8oC = YearlyInvestmentUnder8oC;
	}
	public String getfirstName() {
		return firstName;
	}
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	public String getdepartment() {
		return department;
	}
	public void setdepartment(String department) {
		this.department = department;
	}
	public String getdesignation() {
		return designation;
	}
	public void setdesignation(String designation) {
		this.designation = designation;
	}
	public String getpancard() {
		return pancard;
	}
	public void setpancard(String pancard) {
		this.pancard = pancard;
	}
	public String getemailId() {
		return emailId;
	}
	public void setemailId(String emailId) {
		this.emailId = emailId;
	}
	public Salary getsalary() {
		return salary;
	}
	public void setsalary(Salary salary) {
		this.salary = salary;
	}
	public BankDetails getbankDetails() {
		return bankDetails;
	}
	public void setbankDetails(BankDetails bankDetails) {
		this.bankDetails = bankDetails;
	}
	@Override
	public String toString() {
		return "Associate [associateId=" + associateId + ", yearlyInvestmentUnder8oC=" + YearlyInvestmentUnder8oC
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", department=" + department
				+ ", designation=" + designation + ", pancard=" + pancard + ", emailId=" + emailId + ", salary="
				+ salary + ", bankDetails=" + bankDetails + "]";
	}
	
		
		
		
	}
	
	
	
	
	