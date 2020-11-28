package com.cg.training.lab8.Exercise1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyDataThread implements Runnable {

	public static File is;
	public static File os;
	public CopyDataThread(File is, File os) {
		this. is = is;
		this.os =os;
	}

	@Override
	public void run() {
		int c=0;
		try {
			int count=0;
			FileReader reader = new FileReader(is);
			BufferedReader br=new BufferedReader(reader); 
			FileWriter fw= new FileWriter(os); 
			String str =null;
			while(true) {
				int ch = br.read();
				if(ch==-1) {
					break;
				}
				/*
				 * else { count++; if(count%10==0) {
				 * System.out.println("10 characters are copied"); } }
				 */
				fw.write(ch);
				fw.close();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
