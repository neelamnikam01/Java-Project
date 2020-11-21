package com.capgemini.training.lab4.excercise3.client;

import com.capgemini.training.lab4.excercise3.service.Book;
import com.capgemini.training.lab4.excercise3.service.CD;
import com.capgemini.training.lab4.excercise3.service.JournalPaper;
import com.capgemini.training.lab4.excercise3.service.Video;

public class Tester {

	public static void main(String[] args) {
		
		Book book = new Book(1, "Immortals of Meluha", 2, "PQR");
		book.print();
		book.checkIn();
		book.print();
		
		CD cd = new CD(101, "GHJ", 1, 9, "PQR", "Horror");
		cd.print();
		cd.checkOut();
		cd.print();
		
		JournalPaper jp = new JournalPaper(4, "IEEE", 5, "XYZ", 2001);
		jp.print();
		jp.checkOut();
		jp.print();
		
		Video video = new Video(3, "hbsbx", 5, 4, "One Direction", "Jazz", 1989);
		video.print();
		video.checkIn();
		video.print();
	
		
		
	}

}
