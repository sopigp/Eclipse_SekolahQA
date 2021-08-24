package com.sekolahqa.tugas_konversi_derajat;

import java.util.Scanner;

public class Tugas_Konversi_Derajat {

	public static void main(String[] args) {
		// membuat variabel dan scanner
		int derajat;
		String lagi = "y";
		while (lagi.equals("y")) {

			Scanner scan = new Scanner(System.in);
			System.out.println("==================Konversi Derajat=================\n");
			
			// mengambil input
			System.out.print("Inputkan Derajat: ");
			derajat = scan.nextInt();
			
			// hitung gradenya
			if (derajat <= 0) {
				System.out.println("Beku");
			} else if (derajat >= 1 && derajat <= 10) {
				System.out.println("Dingin");
			} else if (derajat >= 11 && derajat <= 20) {
				System.out.println("Sejuk");
			} else if (derajat >= 21 && derajat <= 25) {
				System.out.println("Sedang");
			} else if (derajat >= 26 && derajat <= 99) {
				System.out.println("Panas"); 
			} else if (derajat >= 100) {
				System.out.println("Mendidih");
			}
			
			System.out.println("Ingin Mencoba Kembali (y/t)?");
			Scanner x = new Scanner(System.in);
			lagi = x.nextLine().toLowerCase();
			}

			System.out.print("Okayy bye! Happy Always...");
		
	}

}
