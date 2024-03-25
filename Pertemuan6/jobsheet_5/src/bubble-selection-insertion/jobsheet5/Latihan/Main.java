package Latihan;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HotelService list = new HotelService();
        Hotel h1 = new Hotel("Hotel Pemuda", "Surabaya", 443000, (byte) 3);
        Hotel h2 = new Hotel("Hotel Aveta", "Yogyakarta", 1093000, (byte) 2);
        Hotel h3 = new Hotel("Hotel Savanna", "Malang", 948000, (byte) 4);
        Hotel h4 = new Hotel("Hotel Alaya", "Bali", 2103000, (byte) 5);
        Hotel h5 = new Hotel("Hotel Astonn", "Semarang", 813000, (byte) 4);

        list.tambah(h1);
        list.tambah(h2);
        list.tambah(h3);
        list.tambah(h4);
        list.tambah(h5);

        System.out.println("List Hotel Yang Tersedia");
        list.tampilAll();    

        while (true) {
            System.out.println("\nSilahkan Pilih Filter");
            System.out.println("1. Filter Harga\n2. Filter Rating\n0. Keluar");
            System.out.print("Masukkan Pilihan Anda : ");
            int pil = input.nextInt();

            if (pil == 0) {
                break;
            }
            
            switch (pil) {
                case 1:
                System.out.println("\nPilih Algoritma Untuk Filter Harga");
                System.out.println("1. Bubble Sort\n2. Selection Sort");
                System.out.print("Masukkan Pilihan Anda : ");
                int alg = input.nextInt();
                    switch (alg) {
                        case 1:
                            System.out.println("\nSorting Harga Hotel Termurah - Tertinggi (Bubble Sort)");
                            list.bubbleHarga();
                            list.tampilAll();
                            break;
                        case 2:
                            System.out.println("\nSorting Harga Hotel Termurah - Tertinggi (Selection Sort)");
                            list.selectionHarga();
                            list.tampilAll();
                            break;
                    
                        default:
                            break;
                    }
                    break;
                    
                case 2:
                System.out.println("\nPilih Algoritma Untuk Filter Rating");
                System.out.println("1. Bubble Sort\n2. Selection Sort");
                System.out.print("Masukkan Pilihan Anda : ");
                int alg1 = input.nextInt();
                    switch (alg1) {
                        case 1:
                            System.out.println("\nSorting Rating Hotel Tertinggi - Terendah (Bubble Sort)");
                            list.bubbleRating();
                            list.tampilAll();
                            break;
                        case 2:
                            System.out.println("\nSorting Rating Hotel Tertinggi - Terendah (Selection Sort)");
                            list.selectionRating();
                            list.tampilAll();
                            break;
                    
                        default:
                            break;
                    }
                    break;
            
                default:
                    break;
            }
        }   
    }
}
