package fr.diginamic.operations;

public class Operations {
	
	public static double calcul(double a, double b, char c) {
		switch (c) {
		case '+':
			return a+b;
		case '-':
			return a-b;
		case '*':
			return a*b;
		case '/':
			return a/b;
		default:
			throw new IllegalArgumentException("Char parameter must be + - * or /");
		}
	}

}
