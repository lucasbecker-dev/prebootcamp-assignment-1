package com.coderscampus.assignment1;

import java.util.Scanner;

public class UserInputReceiver {
	
	private Scanner scanner;
	
	public UserInputReceiver(Scanner scanner) {
		this.scanner = scanner;
	}
	
	public Double getInitialInvestment() {
		System.out.println("Type in your starting investment: ");
		String userInput = scanner.nextLine();
		Double userInputAsDouble = Double.parseDouble(userInput);
		while (userInputAsDouble < 0.0d || userInputAsDouble > 1000000.0d) {
			System.out.println("Invalid input! Investment must be a decimal number from 0.0 to 1000000.0.");
			System.out.println("Type in your starting investment: ");
			userInput = scanner.nextLine();
			userInputAsDouble = Double.parseDouble(userInput);
		}
		return userInputAsDouble;
	}
	
	public Double getInterestRate() {
		System.out.println("Type in your interest rate: ");
		String userInput = scanner.nextLine();
		Double userInputAsDouble = Double.parseDouble(userInput);
		while (userInputAsDouble < 0.0d || userInputAsDouble > 100.0d) {
			System.out.println("Invalid input! Interest rate must be a decimal number from 0.0 to 100.0.");
			System.out.println("Type in your interest rate: ");
			userInput = scanner.nextLine();
			userInputAsDouble = Double.parseDouble(userInput);
		}
		return userInputAsDouble / 100.0d;
	}

}
