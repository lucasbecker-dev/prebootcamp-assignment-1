package com.coderscampus.assignment1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		UserInputReceiver userInputReceiver = new UserInputReceiver(scanner);
		Double initialInvestment = userInputReceiver.getInitialInvestment();
		Double interestRate = userInputReceiver.getInterestRate();
		CompoundInterestCalculator calc = new CompoundInterestCalculator();
		calc.calculateInterest(initialInvestment, interestRate);
		scanner.close();
	}

}
