package com.java.file.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import com.google.common.base.Charsets;
import com.google.common.io.Files;

public class FileReader {
	
	public void read(){

		
		try {
			// Guava jar
			List<String> guavaList = Files.readLines(new File("c:/home/myfiles/test.dat"), Charsets.UTF_8);
			System.out.println("******* reading by Guava ********");
			for(String line : guavaList)
					System.out.println(line);
			// Apache commons io
			List<String> apacheList = FileUtils.readLines(new File("c:/home/myfiles/test.dat"));
			System.out.println("******** reading by Apache commons IO ******");
			for(String line : apacheList)
					System.out.println(line);
			// Using BufferedReader
			FileInputStream fi = new FileInputStream(new File("c:/home/myfiles/test.dat"));
			BufferedReader br = new BufferedReader(new InputStreamReader(fi));
			System.out.println("***** Using Buffered Reader *****");
			String line=null;
			while((line = br.readLine())!=null){
				System.out.println(line);
			}
			br.close();
			
			//Using Apache Commons utility
			System.out.println("***** Apache Commons utility to read line by line *****");
			
			LineIterator iterator = FileUtils.lineIterator(new File("c:/home/myfiles/test.dat"));
			
			while(iterator.hasNext()){
				System.out.println(iterator.nextLine());
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
