package com.cg.training.lab8.Exercise1;

import java.io.File;
import java.io.IOException;

public class FileProgram {

	public static void main(String[] args) throws IOException{
		File is = new File("C:\\Users\\admin\\Desktop\\source.txt");
		File os = new File("C:\\Users\\admin\\Desktop\\target.txt");
		CopyDataThread thread = new CopyDataThread(is,os);
		Thread t1 = new Thread(thread);
		t1.start();
		
	}

}
