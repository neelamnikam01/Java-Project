package com.capgemini.training.lab4.excercise3.service;



public  abstract class WrittenItem extends Item{
	private String author;
	
	public WrittenItem(int id, String title, int numOfCopies, String author) {
		super(id, title, numOfCopies);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public void print() 
	{
		super.print();
		System.out.println("Author: " + author);
	}

}
