package com.karan.taskmanagers;

public interface Task<T> {
	T perform(T object);
}