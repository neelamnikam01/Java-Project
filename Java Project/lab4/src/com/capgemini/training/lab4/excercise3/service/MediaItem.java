package com.capgemini.training.lab4.excercise3.service;


public abstract class MediaItem extends Item
{
	private int runtime;
	
	public MediaItem(int id, String title, int numOfCopies, int runtime) {
		super(id, title, numOfCopies);
		this.runtime = runtime;
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	
	@Override
	public void print() 
	{
		super.print();
		System.out.println("Runtime: " + runtime);
	}

}
