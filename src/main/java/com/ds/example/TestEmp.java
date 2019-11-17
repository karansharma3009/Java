package com.ds.example;
import java.util.HashSet;
import java.util.Set;

public class TestEmp {

	public static void main(String[] args) {
		Employee emp1 = new Employee(23, 123);
		System.out.println("emp1.hashCode()--->>>" + emp1.hashCode());
		Employee emp2 = new Employee(23, 124);
		Employee emp3 = new Employee(25, 123);
		Employee emp4 = new Employee(25, 124);
		Employee emp5 = new Employee(25, 125);
		Employee emp6 = new Employee(25, 126);
		Employee emp7 = new Employee(23, 123);
		if (emp1.equals(emp2)) {
			System.out.println(" objects are equals ");
		} else
			System.out.println("objects are not equal");

		if (emp1.equals(emp3)) {
			System.out.println(" objects are equals ");
		} else
			System.out.println("objects are not equal");
		
	

		// emp 3 ,4,5,6 have same hashcode  they will be stored in hashmap as 25 -[123]-[124]-[125]-[126]
		// in case hashMap returning hashcode of age of that object .



		Set<Employee> employeeSet = new HashSet<Employee>();
		
		System.out.println(employeeSet.add(emp1));  //true
		System.out.println(employeeSet.add(emp2));  // true

		System.out.println(employeeSet.add(emp3));
		System.out.println(employeeSet.add(emp4));
		System.out.println(employeeSet.add(emp5));
		System.out.println(employeeSet.add(emp6));
		
	   //here emp1 and emp3 are equal as per our logic but they are added in hashSet as hashkey is different for emp1 and emp3
		// we are returning age as HashKey which is different for both emp1 and emp3 and thus they are assigned to different buckets
		//Try reading HashSet implementation for more clarity.
		// try adding emp7 with same hashkey as emp1 . it should return false.
		
		// try changin hashcode value to constant i.e. 0  from age in hashcode();
		
		// all the elements will be stored as 0 -[][][][][][][][]
		// and which all have same age will be treated as equal and not be added in hashset 
		// use below code in employee.java and check the output 
		//public int hashCode()
		//{
		//return 0;  // hascode returned is age . so same age wale bande can have same hashcode .
		//	}
		
		System.out.println(employeeSet.add(emp7));
	
	}
	
	
	
}
