package com.karan.taskmanagers;

public class MarutiTaskManager extends TaskManager<MarutiTaskManager> {

	private String color ;
	private int price;
	private String Model;

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
    
	/**
	 * @return the model
	 */
	public String getModel() {
		return Model;
	}


	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		Model = model;
	}


	public void addIngTask()
	{
		this.setColor("Red");
		this.setModel("Maruti-Baleno");
		this.setPrice(2000);
		this.addTasks(new CarExecutor());
		this.addTasks(new CarRunner());
		this.addTasks(new CarWash());
		this.addTasks(new CarTheft());
		
	}
	
	public void executeTask()
	{
		execute(this);
	}
}
