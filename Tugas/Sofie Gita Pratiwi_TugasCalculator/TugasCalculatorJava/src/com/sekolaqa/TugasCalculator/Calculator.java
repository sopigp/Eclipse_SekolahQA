package com.sekolaqa.TugasCalculator;

import java.text.DecimalFormat;
//class yang menyediakan fungsi-fungsi untuk mengambil input dari keyboard
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
				
	System.out.println("======== S I M P L E - C A L C U L A T O R ========");

	System.out.println("===================================================");

	@SuppressWarnings("resource")

//membuat alias dari class Scanner menjadi input 
//untuk di panggil agar dapat di panggil pada class Calculator

	Scanner input = new Scanner(System.in);
	
//Membaca input nilai pertama
	System.out.print("Input Value 1 : ");
	double value1 = input.nextDouble();
	
//Membaca input operator
	System.out.print("Input Operator ( + - * / % ) : ");
	String operator = input.next();
	
//Membaca input nilai kedua
	System.out.print("Input Value 2 : ");
	double value2 = input.nextDouble();
	
	try {
		 double result = new Calculator().getResult(value1, value2, operator);
		 
		 DecimalFormat decimalFormat = new DecimalFormat("#.##");
		 
		 String formattedResult = decimalFormat.format(result);
		 
		 System.out.println("Hasil perhitungan dari " + value1 + operator + value2 + "adalah " + formattedResult);
		 
		 } catch (IllegalArgumentException e) {
			 
		 System.out.println("Operator yang Anda masukkan salah");
	}

}

private double getResult(double value1, double value2, String operator) {
	 switch (operator) {
	 case "+" :
	 return value1 + value2;
	 case "-" :
	 return value1 - value2;
	 case "*" :
	 return value1 * value2;
	 case "/" :
	 return value1 / value2;
	 case "%" :
	 return value1 % value2;
	 default:
	 throw new IllegalArgumentException();
	 }
	}
}

