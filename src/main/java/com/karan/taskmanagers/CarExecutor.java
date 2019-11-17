package com.karan.taskmanagers;

public class CarExecutor<T> implements Task<MarutiTaskManager> {

	
	public MarutiTaskManager perform(MarutiTaskManager m) {

    System.out.println("Execution Car"+ m.getColor()+ m.getModel()+ m.getPrice());
		return m;

	}

	
}
