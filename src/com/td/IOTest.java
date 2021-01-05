package com.td;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream fis = new FileInputStream("data.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			
			String n = br.readLine();
			System.out.println(n);
			while(n != null) {
				n = br.readLine();
				System.out.println(n);
			}
			
			/*int n = fis.read();
			System.out.print((char)n);
			while(n != -1) {
				n = fis.read();
				System.out.print((char)n);
			}*/
			
			/*for(int i = 0; i < 10; i++) {
				int n = fis.read();
				System.out.println(n);
			}*/
			
		}catch(FileNotFoundException e) {
			e.getStackTrace();
		}catch(IOException e) {
			
		}
		
		
				
		
	}

}
