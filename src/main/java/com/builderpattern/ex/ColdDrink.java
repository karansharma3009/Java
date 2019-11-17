package com.builderpattern.ex;

public abstract class ColdDrink implements Item{
	
public Packing packing()
{
	return new Bottle();
}
	
public abstract float price();
}
