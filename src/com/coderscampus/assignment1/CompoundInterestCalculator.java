package com.coderscampus.assignment1;

public class CompoundInterestCalculator {
	
	public void calculateInterest (Double initialInvestment, Double interestRate) {
		Double currentValue = initialInvestment;
		for (int i = 1; i <= 30; ++i) {
			currentValue = currentValue * (interestRate + 1.0d);
			if (i % 5 == 0) {
				System.out.println("After " + i + " years, you would have: " + currentValue.longValue());
			}
		}
	}
	
}
