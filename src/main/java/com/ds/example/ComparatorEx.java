package com.ds.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

 class Car implements Comparable<Car>{
	int model;
	String color;
	int price ;
	
	public Car(int model , String color , int price)
	{
		this.model = model;
		this.color = color;
		this.price = price;
	}

	@Override
	public int compareTo(Car arg0) {
		
		if (this.model > arg0.model) return 1 ;
		else if (this.model < arg0.model) return -1 ;
		else return 0;
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + model;
		result = prime * result + price;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Car)) {
			return false;
		}
		Car other = (Car) obj;
		if (color == null) {
			if (other.color != null) {
				return false;
			}
		} else if (!color.equals(other.color)) {
			return false;
		}
		if (model != other.model) {
			return false;
		}
		if (price != other.price) {
			return false;
		}
		return true;
	}

	
	
	
}
 
 class modelCompare implements Comparator<Car>{

	@Override
	public int compare(Car c1, Car c2) {
		if (c1.model> c2.model) return 1 ;
		else if (c1.model> c2.model) return -1 ;
		else return 0;
			
	}
	 
 }
 
 class ComparatorEx {

public static void main(String[] args) {
	
	List<Car> list = new ArrayList<Car>();
	Car c1 = new Car(1900,"red",2000);
	Car c2 = new Car(1901,"yed",2000);
	Car c3 = new Car(1902,"white",2000);
	Car c4 =  new Car(1900,"red",2000);
	
	list.add(c1);
	list.add(c2);
	list.add(c3);
	list.add(c4);
	Collections.sort(list);
	
	for ( Car c: list)
	{
		System.out.println(c.model);
	}
	
	System.out.println(c1.compareTo(c2));
	System.out.println(c1.compareTo(c4));
	
	modelCompare cc = new modelCompare();
	 Collections.sort(list ,cc);
	 for ( Car c: list)
		{
			System.out.println(c.color);
		}
}
}
