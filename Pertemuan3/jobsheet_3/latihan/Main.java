package Pertemuan3.jobsheet_3.latihan;

import java.util.*;
import java.lang.Math;

public class Main {

    static void inputKerucut() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah kerucut : ");
        int k = input.nextInt();

        kerucut[] kerArray = new kerucut[k];

        for(int i = 0; i < k; i++) {
            System.out.println("Kerucut " + (i+1));
            System.out.print("Jari-Jari : ");
            double r = input.nextDouble();
            System.out.print("Sisi Miring : ");
            double miring = input.nextDouble();
            System.out.println();

            kerArray[i] = new kerucut(r,miring);
            System.out.printf("Volume = %.2f \nLuas Permukaan = %.2f\n\n", kerArray[i].hitungVolume(), kerArray[i].hitungLuasPermukaan());
        }
    }

    static void inputLimas() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah Limas : ");
        int k = input.nextInt();

        limas[] limArray = new limas[k];

        for(int i = 0; i < k; i++) {
            System.out.println("Limas " + (i+1));
            System.out.print("Panjang sisi alas : ");
            double a = input.nextDouble();
            System.out.print("Tinggi : ");
            double t = input.nextDouble();
            System.out.println();

            limArray[i] = new limas(a, t);
            System.out.printf("Volume = %.2f \nLuas Permukaan = %.2f\n\n", limArray[i].hitungVolume(), limArray[i].hitungLuasPermukaan());
        }
    }

    static void inputBola() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah Bola : ");
        int k = input.nextInt();

        bola[] bolArray = new bola[k];

        for(int i = 0; i < k; i++) {
            System.out.println("Bola " + (i+1));
            System.out.print("Jari-Jari : ");
            double r = input.nextDouble();
            System.out.println();

            bolArray[i] = new bola(r);
            System.out.printf("Volume = %.2f \nLuas Permukaan = %.2f\n\n", bolArray[i].hitungVolume(), bolArray[i].hitungLuasPermukaan());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Program Menghitung Bangun Ruang");
            System.out.println("\nSilahkan pilih bangun ruang!");
            System.out.println("1. Kerucut\n2. Limas Segi Empat Sama Kaki\n3. Bola\n0. Keluar");
            System.out.print("Silahkan Masukkan Pilihan Anda : ");
            int pilihan = input.nextInt();

            if(pilihan == 0) {
                break;
            }

            switch (pilihan) {
                // Kerucut
                case 1:
                    inputKerucut();
                    break;

                // Limas    
                case 2:
                    inputLimas();
                    break;

                // Bola    
                case 3:
                    inputBola();
                    break;
            
                default:
                    System.out.println("Pilihan yang Anda Masukkan Salah! Silahkan Coba Lagi!");
                    break;
            }
        }

        
    }
}
