package leinad;

import java.util.Scanner;

public class Prompt {
	
	public void askAll(){
		StratR roul = new StratR();
		
		Scanner ask = new Scanner(System.in);
	
		System.out.println("To begin select an option below:\n 1. Roulette\n 2. Black Jack\n");
		System.out.println("Enter your selection:");
	
		Integer tableSelection = Integer.parseInt(ask.nextLine());
		
		if (tableSelection == 1) {
			System.out.println("\n|Welcome to Roulette Strategy!|\nWhat strategy would you like to use? \n 1. Martingle\n");
			System.out.println("Enter your selection:");
			Integer stratSelection = Integer.parseInt(ask.nextLine());
			
			if (stratSelection == 1) {
				roul.martingale();
			}
		
		}
		
		ask.close();
	}
}
