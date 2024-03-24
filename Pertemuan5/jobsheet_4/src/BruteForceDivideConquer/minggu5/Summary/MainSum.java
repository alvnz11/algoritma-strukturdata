package BruteForceDivideConquer.minggu5.Summary;

import java.util.*;

public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        
        System.out.println("==========================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta, Misal 5.9)");
        System.out.print("Masukkan jumlah Perusahaan: ");
        int per = sc.nextInt();

        Sum[] sm = new Sum[per];
        
        for(int i = 0; i < per; i++) {
            System.out.print("Masukkan jumlah bulan pada perusahaan ke-" + (i+1) + ": ");
            int bul = sc.nextInt();
            sm[i] = new Sum(bul);
        }
        System.out.println("==========================");
        for(int i = 0; i < per; i++) {
            System.out.println("PERUSAHAAN " + (i + 1));
            for(int j = 0; j < sm[i].elemen; j++) {
                System.out.print("Masukkan untung bulan ke - " + (j+1) + " = ");
                sm[i].keuntungan[j] = sc.nextDouble();
            }
        }

        System.out.println("==========================");
        System.out.println("Algoritma Brute Force");
        for(int i = 0; i < per; i++) {
            System.out.println("Total keuntungan perusahaan " + (i+1) + " selama " + sm[i].elemen + " bulan adalah = " + sm[i].totalBF(sm[i].keuntungan) + " Juta");
        }

        System.out.println("==========================");
        System.out.println("Algoritma Divide & Conquer");
        for(int i = 0; i < per; i++) {
            System.out.println("Total keuntungan perusahaan " + (i+1) + " selama " + sm[i].elemen + " bulan adalah = " + sm[i].totalDC(sm[i].keuntungan, 0, sm[i].elemen-1) + " Juta");
        }
        
    }
}
