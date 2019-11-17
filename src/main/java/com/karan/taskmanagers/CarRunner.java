package com.karan.taskmanagers;

public class CarRunner implements Task<MarutiTaskManager> {

	@Override
	public MarutiTaskManager perform(MarutiTaskManager object) {
		
		System.out.println("Running Car" + object.getColor() + object.getModel() + object.getPrice());
		return object;
	}

}
