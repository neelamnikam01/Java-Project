package com.capgemini.training.lab4.excercise3.service;



public class Item {

	private int id;
	private String title;
	private int numOfCopies;
	
	public Item(int id, String title, int numOfCopies){
		this.id = id;
		this.title = title;
		this.numOfCopies = numOfCopies;
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getNumOfCopies() {
		return numOfCopies;
	}


	public void setNumOfCopies(int numOfCopies) {
		this.numOfCopies = numOfCopies;
	}


	public void checkIn() {
		numOfCopies = numOfCopies + 1;
	}
	
	public void checkOut() {
		numOfCopies = numOfCopies - 1;
	}
	
	@Override
	public String toString(){
		return "ID: " + id + " Title: " + title + " Number of Copies: " + numOfCopies;
	}
	
	public void print() {
		System.out.println("ID: " + id);
		System.out.println("Title: " + title);
		System.out.println("Number of copies: " + numOfCopies);
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj == null)
			return false;
		
		Item otherItem = (Item) obj;
		return id == otherItem.id && 
			   title == otherItem.title && 
			   numOfCopies == otherItem.numOfCopies;
	}
	
	public void addItem(int idNum, String str, int n) {
		setId(idNum);
		setTitle(str);
		setNumOfCopies(n);
	}

}
