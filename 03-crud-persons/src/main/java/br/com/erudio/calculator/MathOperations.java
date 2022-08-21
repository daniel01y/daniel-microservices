package br.com.erudio.calculator;

import org.springframework.stereotype.Service;

@Service
public class MathOperations {
	
	public Double sum(Double numberOne, Double numberTwo) {
		Double sum = numberOne + numberTwo;
		return sum;
	}
	
	public Double sub(Double numberOne, Double numberTwo) {
		Double sum = numberOne - numberTwo;
		return sum;
	}
	
	public Double multi(Double numberOne, Double numberTwo) {
		Double sum = numberOne * numberTwo;
		return sum;
	}
	
	public Double div(Double numberOne, Double numberTwo) {
		Double sum = numberOne / numberTwo;
		return sum;
	}
	
	public Double mean(Double numberOne, Double numberTwo) {
		Double sum = (numberOne + numberTwo) / 2;
		return sum;
	}
	
	public Double sqrt(Double number) {
		Double sum = Math.sqrt(number);
		return sum;
	}
	
}
