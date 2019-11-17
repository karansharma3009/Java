package com.karan.taskmanagers;

public class CarTheft implements Task<MarutiTaskManager> {

	@Override
	public MarutiTaskManager perform(MarutiTaskManager object) {
		System.out.println("Chori ho gayi  Car" + object.getColor() + object.getModel() + object.getPrice());
		return object;
	}

}
