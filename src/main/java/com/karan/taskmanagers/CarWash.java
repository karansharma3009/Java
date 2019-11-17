package com.karan.taskmanagers;

public class CarWash implements Task<MarutiTaskManager> {

	@Override
	public MarutiTaskManager perform(MarutiTaskManager object) {
		System.out.println("Washing Car" + object.getColor() + object.getModel() + object.getPrice());
		// TODO Auto-generated method stub
		return object;
	}

}
