package com.capgemini.training.lab4.excercise3.service;


public class CD extends MediaItem
{
	private String artist, CDgenre;
	private String CDGenre;
	
	public CD(int id, String title, int numOfCopies, int runtime, String artist, String CDGenre) {
		super(id, title, numOfCopies, runtime);
		this.artist = artist;
		this.CDGenre = CDGenre;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getCDGenre() {
		return CDGenre;
	}

	public void setCDGenre(String cDGenre) {
		CDGenre = cDGenre;
	}
	
	@Override
	public void print() 
	{
		super.print();
		System.out.println("Artist: " + artist);
		System.out.println("Genre: " + CDgenre);
	}
}
