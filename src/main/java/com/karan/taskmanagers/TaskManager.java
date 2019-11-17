package com.karan.taskmanagers;

import java.util.LinkedList;
import java.util.List;

public abstract class TaskManager<T> implements Executor<T>{

	private List<Task<T>> tasks=null;
	
	public TaskManager(){
		
		if ( tasks==null){
			tasks = new LinkedList<Task<T>>();
		}
	}
	
	public void addTasks(Task<T> task){
		this.tasks.add(task);
	}
	
	@Override
	public void execute(T object) {
		for (Task<T> task : getTasks()) {
			task.perform(object);
		}
		tasks.clear();
	}
	
	
	private List<Task<T>> getTasks() {
		return tasks;
	}
}
