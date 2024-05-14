package Tugas2;

import java.util.*;

public class Main {

    public static void menu() {
        System.out.println("===============================");
        System.out.println("DATA FILM LAYAR LEBAR");
        System.out.println("===============================");
        System.out.println("1. Tambah Data Awal");
        System.out.println("2. Tambah Data Akhir");
        System.out.println("3. Tambah Data Index tertentu");
        System.out.println("4. Hapus Data Pertama");
        System.out.println("5. Hapus Data Terakhir");
        System.out.println("6. Hapus Data tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari ID Film");
        System.out.println("9. Urut Data Rating Film-DESC");
        System.out.println("0. Exit");
        System.out.println("===============================");
    }

    public static Film inputData() {
        Scanner sc = new Scanner(System.in);

        System.out.println("ID Film : ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Judul Film : ");
        String jdl = sc.nextLine();
        System.out.println("Rating Film : ");
        double rating = sc.nextDouble();
        sc.nextLine();

        return new Film(id, jdl, rating);
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
                    System.out.println("Masukkan Data Film Posisi Awal");
                    dll.addFirst(inputData());
                    break;

                case 2:
                    System.out.println("Masukkan Data Film Posisi Akhir");
                    dll.addLast(inputData());
                    break;

                case 3:
                    System.out.println("Masukkan Data Film");
                    Film dt = inputData();
                    System.out.println("Data Film dimasukkan pada urutan ke-");
                    int idx = sc.nextInt();
                    dll.add(dt, idx);
                    break;

                case 4:
                    System.out.println("Menghapus Data Film Pertama");
                    dll.removeFirst();
                    break;

                case 5:
                    System.out.println("Menghapus Data Film Terakhir");
                    dll.removeLast();
                    break;

                case 6:
                    System.out.println("Menghapus Data");
                    System.out.println("Masukkan urutan film : ");
                    int idx1 = sc.nextInt();
                    dll.remove(idx1);
                    break;

                case 7:
                    System.out.println("Cetak Data");
                    dll.print();
                    break;

                case 8:
                    System.out.println("Masukkan ID Film yang dicari: ");
                    int idx2 = sc.nextInt();
                    dll.position(idx2, dll.search(idx2));
                    break;

                case 9:
                    System.out.println("Mengurutkan Data Rating Film-DESC");
                    dll.sorting();
                    dll.print();
                    break;

                case 0:
                    System.exit(0);
                    break;
            
                default:
                    System.out.println("Pilihan Tidak Tersedia\n");
                    break;
            }
        } while (true);
    }
}
