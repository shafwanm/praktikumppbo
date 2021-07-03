package ControlStatementProject;

import java.util.Scanner;

public class leapYearCalculator {

	public static void main(String[] args) {
		try (Scanner in = new Scanner (System.in)) {
			int hari, bln, thn;
			String nama = null;
			
			System.out.print("Masukkan Bulan (1-12) : ");
			bln = in.nextInt();
			System.out.print("Masukkan Tahun : ");
			thn = in.nextInt();
			
			System.out.println("\n Hasil : ");
			String evenOdd = (bln % 2 == 0) ? "Genap" : "Ganjil";
				
				switch (bln) {
				case 1 :
					nama = "Januari";
					hari = 31;
					break;
				case 2 :
					nama = "Feruari";
					hari = 28;
					break;
				case 3 :
					nama = "Maret";
					hari = 31;
					break;
				case 4 :
					nama = "April";
					hari = 30;
					break;
				case 5 :
					nama = "Mei";
					hari = 31;
					break;
				case 6 :
					nama = "Juni";
					hari = 30;
					break;
				case 7 :
					nama = "Juli";
					hari = 31;
					break;
				case 8 : 
					nama = "Agustus";
					hari = 31;
					break;
				case 9 :
					nama = "September";
					hari = 30;
					break;
				case 10 :
					nama = "Oktober";
					hari = 31;
					break;
				case 11 :
					nama = "November";
					hari = 30;
					break;
				case 12 :
					nama = "Desember";
					hari = 31;
					break;
				default :
					hari = 0;
					System.out.println(" ==> Periksa Kembali inputan Anda!! <==");
					break;
				}
			
			if ((thn % 4 == 0 && thn % 100 != 0) || thn % 400 == 0) {
				System.out.println("==> Tahun Kabisat <==");
				if (hari == 28) {
					hari = 29;
				}
			}
			
			else {
				System.out.println("==> Bukan Tahun Kabisat <==");
			}
			
			System.out.println("==> Inputan Bulan : "+evenOdd);
			System.out.println("==> Bulan "+nama+" memiliki "+ hari+" hari");		
		}
	}
}