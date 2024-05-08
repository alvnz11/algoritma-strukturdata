package Warung;

import java.util.Scanner;

public class QueueMain {
    public static void menu() {
        System.out.println("Pilih Menu: ");
        System.out.println("1. Antrian Baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Kosongkan Semua Antrian");
        System.out.println("4. Cek Antrian Terdepan");
        System.out.println("5. Cek Antrian Paling Belakang");
        System.out.println("6. Cek Semua Antrian");
        System.out.println("7. Cek Posisi Antrian Dengan Nama");
        System.out.println("0. Keluar");
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pilih;

        System.out.print("Masukkan kapasitas antrian: ");
        int jumlah = sc.nextInt();

        Queue antri = new Queue(jumlah);

        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();

            if (pilih == 0) {
                break;
            }

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("No HP: ");
                    String no = sc.nextLine();
                    Pembeli pb = new Pembeli(nama, no);
                    antri.enqueue(pb);
                    System.out.println();
                    break;

                case 2:
                    Pembeli data = antri.dequeue();
                    if(!"".equals(data.nama) && !"".equals(data.noHP)) {
                        System.out.println("Antrian yang keluar: " + data.nama + " " + data.noHP);
                    }
                    System.out.println();
                    break;

                case 3:
                    antri.clear();
                    break;

                case 4:
                    antri.peek();
                    System.out.println();
                    break;

                case 5:
                    antri.peekRear();
                    System.out.println();
                    break;

                case 6:
                    antri.print();
                    System.out.println();
                    break;

                case 7:
                    System.out.print("Masukkan nama: ");
                    String namaPos = sc.nextLine();
                    antri.peekPosition(namaPos);
                    System.out.println();
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia, Silahkan pilih menu lain!!");
                    break;
            }
        } while (true);
    }
}
