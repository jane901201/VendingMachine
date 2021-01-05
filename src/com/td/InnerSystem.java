package com.td;

import java.util.Scanner;

public class InnerSystem {
	
	
	
	int money = -1, total = 0;
	
	String drink[] = {"a", "b", "c"};
	int drinkCoin[] = {10, 5, 15};
	
	public void getStart() {
						
		while(money != 0) {			
			System.out.println("Please insert your coin/choose?");
			
			checkDrinks();			
			
			if(money == 0) {
				System.out.println("Good bye");
				break;
			}
			
			
		} 
	}
	
	
	private void checkDrinks() {
		String check = setCheck();
		boolean isDrink = setIsDrink(check);		
			if(isDrink) {				
				buyDrink(check);
		   }
			else {
			money = Integer.parseInt(check);
			setTotal(money);
			printCanBuy();
		}
	}
	
	
	private void printCanBuy() {
		System.out.println("Your total is " + total);
		for(int i = 0; i < drink.length; i++) {
				if(total >= drinkCoin[i]) {
					System.out.println(drink[i] + ")" + drinkCoin[i]);
				}												
		}				
	}
	
	private void buyDrink(String check) {
		for(int i = 0; i < drink.length; i++) {
			if(check.equals(drink[i])) {
				if(total >= drinkCoin[i]) {
					System.out.println("You got a " + drink[i] + "!");
					total -= drinkCoin[i];
				}
				else {
				System.out.println("You don't have enough money, you only"
						+ " have " + total);
			}				
			}
			
	}		
	}
	
	
	private boolean setIsDrink(String check) {
		boolean isDrink = false;
		
		for(int i = 0; i < drink.length; i++) {
			if(check.equals(drink[i])) {
				isDrink = true;				
			}
		}
		
		return isDrink;
	}
	
	private void setTotal(int money) {
		
		total += money;						
	}
	
	private String setCheck() {
		String check = "";
		Scanner scanner = new Scanner(System.in);
		check = scanner.next();
		return check;
	}

}
