package com.td;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream fis = new FileInputStream("data.txt");
			for(int i = 0; i < 10; i++) {
				int n = fis.read();
				System.out.println(n);
			}
			
		}catch(FileNotFoundException e) {
			e.getStackTrace();
		}catch(IOException e) {
			
		}
		
		
				
		
	}

}
