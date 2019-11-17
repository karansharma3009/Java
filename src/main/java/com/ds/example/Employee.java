package com.ds.example;

public class Employee {

	private int empid;
	private int age ;
	
	public Employee(int age , int empid )
	{
		super();
		this.age = age;
		this.empid = empid;
	}
	
	public int hashCode()
	{
		
		return age;  // hascode returned is age . so same age wale bande can have same hashcode .
		
	}
	public boolean equals(Object obj)
	{
		boolean bool = false;
		Employee emp = (Employee)obj;
		if( emp.empid == empid)  // employee objects are only equal if emp id is equal 
		return true;
		else 
			return bool;
	}
	
	
}
