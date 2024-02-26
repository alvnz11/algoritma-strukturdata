package Pertemuan3.jobsheet_3.arrayObjects;

import java.util.*;

import java.util.Scanner;

public class arrayObject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah persegi panjang : ");
        int jml = sc.nextInt();

        persegiPanjang[] ppArray = new persegiPanjang[jml];

        for(int i = 0; i < jml; i++) {
            ppArray[i] = new persegiPanjang();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }

        for(int i = 0; i < jml; i++) {
            System.out.println("Persegi panjang ke-" + i);
            System.out.println("panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
        }

        // ppArray[0] = new persegiPanjang();
        // ppArray[0].panjang = 110;
        // ppArray[0].lebar = 30;

        // ppArray[1] = new persegiPanjang();
        // ppArray[1].panjang = 60;
        // ppArray[1].lebar = 40;

        // ppArray[2] = new persegiPanjang();
        // ppArray[2].panjang = 100;
        // ppArray[2].lebar = 20;

        // System.out.println("Persegi panjang ke-0, panjang: " + ppArray[0].panjang + ", lebar: " + ppArray[0].lebar);
        // System.out.println("Persegi panjang ke-1, panjang: " + ppArray[1].panjang + ", lebar: " + ppArray[1].lebar);
        // System.out.println("Persegi panjang ke-2, panjang: " + ppArray[2].panjang + ", lebar: " + ppArray[2].lebar);
    }
}
