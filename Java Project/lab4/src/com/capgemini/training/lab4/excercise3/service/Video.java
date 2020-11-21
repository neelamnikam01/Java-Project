package com.capgemini.training.lab4.excercise3.service;


public class Video extends MediaItem
{
	private String director, genre;
	private int releaseYear;
	
	public Video(int id, String title, int numOfCopies, int runtime, String director, String genre, int releaseYear) {
		super(id, title, numOfCopies, runtime);
		this.director = director;
		this.genre = genre;
		this.releaseYear = releaseYear;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	
	@Override
	public void print() 
	{
		super.print();
		System.out.println("Director: " + director);
		System.out.println("Genre: " + genre);
		System.out.println("Year of Release: " + releaseYear);
	}


}
