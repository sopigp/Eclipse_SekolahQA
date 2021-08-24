package com.sekolahqa.tugas_bintang;

public class Tugas_Persegi_Berulang {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kotak = 5;
		int barisAwal = 0;
		int bil = 1;
		for (int i = 0; i < kotak; i++) {
			for (int k = 0; k < bil; k++) {
				for (int j = 0; j < barisAwal; j++) {
					System.out.print(" ");
				}
				for (int l = 0; l < bil; l++) {
					System.out.print("*");
				}
				System.out.println();
			}
			barisAwal = barisAwal + bil;
			bil = bil + 2;
		}
	}
}