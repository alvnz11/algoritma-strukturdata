package Tugas1;

import java.util.*;

public class DLLMain {

    public static void menu() {
        System.out.println("\n++++++++++++++++++++++++++++++");
        System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
        System.out.println("++++++++++++++++++++++++++++++\n");
        System.out.println("1. Tambah Data Penerima Vaksin");
        System.out.println("2. Hapus Data Pengantri Vaksin");
        System.out.println("3. Daftar Penerima Vaksin");
        System.out.println("4. Keluar");
        System.out.println("++++++++++++++++++++++++++++++");
    }

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        DLL dll = new DLL();

        do {
            menu();
            int pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("------------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("------------------------------");
                    System.out.println("Nomor Antrian : ");
                    int no = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nama Penerima : ");
                    String nama = sc.nextLine();
                    dll.addLast(new Penerima(no, nama));
                    break;

                case 2:
                    dll.removeFirst();
                    break;

                case 3:
                    dll.print();
                    break;

                case 4:
                    System.exit(4);
                    break;
            
                default:
                    System.out.println("Pilihan yang anda masukkan salah, silahkan coba lagi\n");
                    break;
            }
        } while (true);
    }
}
