package com.spring.beans;

public class Employee {
	private String eid;
	private String ename;
	private float esal;
	private Account account1;
	private Account account2;
	private Address address;
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public float getEsal() {
		return esal;
	}
	public void setEsal(float esal) {
		this.esal = esal;
	}
	
	public Account getAccount1() {
		return account1;
	}
	public void setAccount1(Account account1) {
		this.account1 = account1;
	}
	public Account getAccount2() {
		return account2;
	}
	public void setAccount2(Account account2) {
		this.account2 = account2;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void getEmployeeDetails() {
		System.out.println("Employee Details");
		System.out.println("-------------------------");
		System.out.println("Employee Id			: "+eid);
		System.out.println("Employee Name		: "+ename);
		System.out.println("Employee Salary		: "+esal);
		System.out.println();
		System.out.println("Account Details");
		System.out.println("-------------------------");
		System.out.println("Account Number		: "+account1.getAccNo());
		System.out.println("Account Name		: "+account1.getAccName());
		System.out.println("Account Type		: "+account1.getAccType());
		System.out.println("Account Balance		: "+account1.getBalance());
		System.out.println();
		System.out.println("Address Details");
		System.out.println("-------------------------");
		System.out.println("House No			: "+address.getHno());
		System.out.println("Street				: "+address.getStreet());
		System.out.println("City				: "+address.getCity());
		System.out.println("State				: "+address.getState());
		
	}
}
