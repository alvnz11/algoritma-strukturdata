package TestSearching.P7.Buku;

import java.util.*;

public class BukuMain04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        
        PencarianBuku04 data = new PencarianBuku04();
        int jumBuku = 5;
        
        // System.out.println("---------------------------------------");
        // System.out.println("Masukkan data buku secara urut dari Kode Buku terkecil : ");
        // for(int i = 0; i < jumBuku; i++) {
        //     System.out.println("===================");
        //     System.out.print("Kode Buku : ");
        //     String kodeBuku = s1.nextLine();
        //     System.out.print("Judul Buku : ");
        //     String judulBuku = s1.nextLine();
        //     System.out.print("Tahun Terbit : ");
        //     int thnTerbit = s.nextInt();
        //     System.out.print("Pengarang : ");
        //     String pengarang = s1.nextLine();
        //     System.out.print("Stock : ");
        //     int stock = s.nextInt();

        //     Buku04 m = new Buku04(kodeBuku, judulBuku, thnTerbit, pengarang, stock);
        //     data.tambah(m);
        // }

        Buku04 m4 = new Buku04("125", "Web programming", 2022, "Pustaka Adi", 2);
        data.tambah(m4);
        Buku04 m2 = new Buku04("123", "Big data", 2020, "Susilo", 3);
        data.tambah(m2);
        Buku04 m5 = new Buku04("127", "Algoritma", 2023, "Darmawan Adi", 2);
        data.tambah(m5);
        Buku04 m3 = new Buku04("126", "Desain UI", 2021, "Supriadi", 3);
        data.tambah(m3);
        Buku04 m1 = new Buku04("111", "Algoritma", 2019, "Wahyuni", 5);
        data.tambah(m1);

        System.out.println("--------------------------------------");
        System.out.println("Data Keseluruhan Buku : ");
        data.tampil();
        data.bubbleSortBuku();
        System.out.println("--------------------------------------");
        System.out.println("Data Keseluruhan Buku (Setelah di Sorting) : ");
        data.tampil();
        
        while(true) {
            System.out.println("______________________________________");
            System.out.println("______________________________________");
            System.out.println("Pencarian Data");
            System.out.println("Pilih Metode Pencarian!");
            System.out.println("1. Kode Buku\n2. Judul Buku\n0. Exit");
            System.out.print("Masukkan pilihan anda : ");
            int pil = s.nextInt();

            if(pil == 0) {
                break;
            }

            switch (pil) {
                // Kode Buku
                case 1:
                System.out.println("Masukkan kode buku yang dicari: ");
                System.out.print("Kode buku : ");
                String cari = s1.nextLine();
                System.out.println("Menggunakan Sequential Search");
                int pos = data.findSeqSearchString(cari);
                data.tampilPosisiString(cari, pos);
                data.tampilDataString(cari, pos);
                System.out.println("======================================");
                System.out.println("Menggunakan Binary Search");
                pos = data.findBinarySearchString(cari, 0, jumBuku - 1);
                data.tampilPosisiString(cari, pos);
                data.tampilDataString(cari, pos);
                    break;
            
                case 2:
                // Judul Buku
                System.out.println("Masukkan judul buku yang dicari: ");
                System.out.print("Judul buku : ");
                String cariJudul = s1.nextLine();
                if(data.hitung(cariJudul) > 1 ){
                    System.out.println("Data ditemukan sebanyak " + data.hitung(cariJudul));
                } else {
                    System.out.println("Menggunakan Sequential Search");
                    int pos1 = data.findSeqSearchJudul(cariJudul);
                    data.tampilPosisiString(cariJudul, pos1);
                    data.tampilDataString(cariJudul, pos1);
                    System.out.println("======================================");
                    System.out.println("Menggunakan Binary Search");
                    int pos2 = data.findBinarySearchJudul(cariJudul, 0, jumBuku - 1);
                    data.tampilPosisiString(cariJudul, pos2);
                    data.tampilDataString(cariJudul, pos2);
                }
                    break;
            
                default:
                    System.out.println("Pilihan yang anda masukkan salah!!");
                    break;
            }
        }

        // int posisi = data.findSeqSearch(cari);
        // data.tampilPosisi(cari, posisi);
        // data.tampilData(cari, posisi);
        // System.out.println("______________________________________");
        // System.out.println("Data Menggunakan Method findBuku()");
        // Buku04 dataBuku = data.findBuku(cari);
        // dataBuku.tampilDataBuku();
        // System.out.println("======================================");
        // System.out.println("Menggunakan Binary Search");
        // posisi = data.findBinarySearch(cari, 0, jumBuku - 1);
        // data.tampilPosisi(cari, posisi);
        // data.tampilData(cari, posisi);
    }
}
