package com.sekolaqa.TugasCalculator;

import java.util.Scanner;

/**
 * Menentukan bilangan ganjil/genap
 * @author sopigp
 *
 * @date July 11, 2021
 */
public class CalculatorGanjil_Genap {

	public static void main(String[] args) {
		
		int bilangan;
		String lagi = "Y"; 
		while(lagi.equals("Y")) 
		{
		Scanner input = new Scanner(System.in);
	
		System.out.println("----------------------------------------------------");
		System.out.println("PROGRAM MENENTUKAN BILANGAN GANJIL GENAP SEKOLAH QA |");
		System.out.println("----------------------------------------------------");
		System.out.print("Masukan Bilangan: ");
		bilangan = input.nextInt();

		// cek apakah bilangan yang di input
		if (bilangan % 2 == 0) {
			System.out.println("Angka " + bilangan + " adalah Bilangan Genap");
		} else {
			System.out.println("Angka " + bilangan + " adalah Bilangan Ganjil");
		}
		
		System.out.println("Ingin Mencoba Kembali (Y/T)?");
		Scanner x = new Scanner(System.in);
		lagi = x.nextLine().toUpperCase();
		}
		System.out.print("Okayy bye! Happy Always...");
		
	}

}
