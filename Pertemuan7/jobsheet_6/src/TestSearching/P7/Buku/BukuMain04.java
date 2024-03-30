package TestSearching.P7.Buku;

import java.util.*;

public class BukuMain04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        
        PencarianBuku04 data = new PencarianBuku04();
        int jumBuku = 5;
        
        System.out.println("---------------------------------------");
        System.out.println("Masukkan data buku secara urut dari Kode Buku terecil : ");
        for(int i = 0; i < jumBuku; i++) {
            System.out.println("===================");
            System.out.print("Kode Buku : ");
            int kodeBuku = s.nextInt();
            System.out.print("Judul Buku : ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit : ");
            int thnTerbit = s.nextInt();
            System.out.print("Pengarang : ");
            String pengarang = s1.nextLine();
            System.out.print("Stock : ");
            int stock = s.nextInt();

            Buku04 m = new Buku04(kodeBuku, judulBuku, thnTerbit, pengarang, stock);
            data.tambah(m);
        }
        System.out.println("--------------------------------------");
        System.out.println("Data Keseluruhan Buku : ");
        data.tampil();

        System.out.println("______________________________________");
        System.out.println("______________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan kode buku yang dicari: ");
        System.out.print("Kode buku : ");
        int cari = s.nextInt();
        System.out.println("Menggunakan Sequential Search");
        int posisi = data.findSeqSearch(cari);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);
    }
}
