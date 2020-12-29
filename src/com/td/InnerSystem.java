package com.td;

import java.util.Scanner;

public class InnerSystem {
	
	
	
	int money = -1, total = 0;
	
	String drink[] = {"a", "b", "c"};
	
	public void getStart() {
		
		
		
		while(money != 0) {			
			System.out.println("Please inser your coin/choose?");
			
			checkDrinks();			
			
			
		} 
	}
	
	
	private void checkDrinks() {
		String check = "";
		Scanner scanner = new Scanner(System.in);
		check = scanner.next();
		for(int i = 0; i < drink.length; i++) {
			
		}
		
	}
	
	private void setTotal(int money) {
		
		total += money;						
	}
	
	private void check() {
		
	}
	
}
