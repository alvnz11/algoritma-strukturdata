package Pertemuan3.jobsheet_3.latihan2;

import java.util.*;

public class Main {

    // mencari nilai terbesar
    static double ipkBesar(double nilai[]) {
        Arrays.sort(nilai);
        return nilai[nilai.length - 1];
    }

    // rata-rata IPK
    static double rataIPK(double ipk[]) {
        double jml = 0;
        for(int i = 0; i < 3; i++) {
            jml += ipk[i];
        }
        return  jml/3;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // String
        Scanner sc = new Scanner(System.in); // double

        double[] nilai = new double[3];
        mahasiswa[] mhs = new mahasiswa[3];

        for(int i = 0; i < 3; i++) {
            System.out.println("Mahasiswa  ke-" + (i+1));
            System.out.print("Masukkan Nama : ");
            String nama = input.nextLine();
            System.out.print("Masukkan NIM : ");
            String nim = input.nextLine();
            System.out.print("Masukkan Jenis Kelamin (L/P) : ");
            String jk = input.nextLine();
            System.out.print("Masukkan IPK : ");
            double ipk = sc.nextDouble();
            System.out.println();
            
            mhs[i] = new mahasiswa(nama, nim, jk, ipk);
            nilai[i] = mhs[i].ipk;
        }

        System.out.println("===Rekap Data Mahasiswa===\n");

        for(int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa  ke-" + (i+1));
            System.out.println("Nama\t\t: " + mhs[i].nama + "\nNIM\t\t: " + mhs[i].nim + "\nJenis Kelamin\t: " + mhs[i].jenisKelamin.toUpperCase() + "\nIPK\t\t: " + mhs[i].ipk);
            System.out.println();            
        }

        // System.out.printf("Rata-Rata IPK\t= %.2f", rataIPK(nilai));
        // System.out.println("\nIPK Tertinggi\t= " + ipkBesar(nilai));
    }
}
