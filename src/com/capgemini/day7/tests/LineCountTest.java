package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import org.junit.jupiter.api.Test;

class LineCountTest {

	@Test
	void testNumberOfLines() {
		
		File file=new File("C:\\Pallavi\\Sample.txt");
		try (FileReader fileReader = new FileReader(file);
				BufferedReader reader = new BufferedReader(fileReader)
				) {		
			
			String s;
			while( (s = reader.readLine()) != null)
					System.out.println(s);	
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
