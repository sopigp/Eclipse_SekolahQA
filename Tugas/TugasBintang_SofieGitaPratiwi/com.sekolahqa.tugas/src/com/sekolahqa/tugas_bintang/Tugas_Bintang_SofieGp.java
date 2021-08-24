package com.sekolahqa.tugas_bintang;

/*
 * 
 * Arisa
 * July 20, 2021
 *
 */

public class Tugas_Bintang_SofieGp {

	public static void main(String[] args) {
		int tinggi_bintang = 10;

		for (int i = 1; i < tinggi_bintang; i++) {
			for (int j = 1; j < tinggi_bintang; j++) {
				if(i == j || i + j == tinggi_bintang-1 || i == tinggi_bintang / 2 || j == tinggi_bintang / 2){
					System.out.print("*");
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}
}
