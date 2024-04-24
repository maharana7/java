package com.nit.calculator;

public class Calculator {

	double firstNumber, secondNumber;

	Calculator(double firstNumber, double secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}

	double addition() {
		return firstNumber + secondNumber;
	}

	double subtraction() {
		return firstNumber - secondNumber;
	}

	double product() {
		return firstNumber * secondNumber;
	}

	double division() {
		return firstNumber / secondNumber;
	}

}
