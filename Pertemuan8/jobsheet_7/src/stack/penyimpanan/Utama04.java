package stack.penyimpanan;

import java.util.*;

public class Utama04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input kapasitas Gudang : ");
        int kap = scanner.nextInt();
        scanner.nextLine();

        Gudang04 gudang = new Gudang04(kap);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Barang\t\t5. Tampilkan Barang Terbawah\n2. Ambil Barang\t\t\t6. Cari Barang\n3. Tampilkan Tumpukan Barang\t0. Exit\n4. Tampilkan Barang Teratas");
            System.out.print("Pilih Operasi : ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang : ");
                    int kode = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan nama barang : ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan nama kategori : ");
                    String kategori = scanner.nextLine();
                    Barang04 barangBaru = new Barang04(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
            
                case 2:
                    gudang.ambilBarang();
                    break;
            
                case 3:
                    gudang.tampilkanBarang();
                    break;
            
                case 4:
                    gudang.lihatBarangTop();
                    break;

                case 5:
                    gudang.lihatBarangTerbawah();
                    break;

                case 6:
                    System.out.println("Menu:");
                    System.out.println("1. Kode Barang\n2. Nama Barang");
                    System.out.print("Pilih Operasi : ");
                    int pilih = scanner.nextInt();
                    scanner.nextLine();
                    switch (pilih) {
                        case 1:
                            System.out.print("Masukkan kode barang yang anda cari : ");
                            int cari = scanner.nextInt();
                            gudang.cariKodeBarang(cari);
                            if (gudang.cariKodeBarang(cari) == true) {
                                System.out.println("Barang yang anda cari ada di dalam gudang");
                            } else {
                                System.out.println("Barang yang anda cari tidak ada di dalam gudang");	
                            }
                            break;

                        case 2:
                            System.out.print("Masukkan nama barang yang anda cari : ");
                            String cariNama = scanner.nextLine();
                            gudang.cariNamaBarang(cariNama);
                            if (gudang.cariNamaBarang(cariNama) == true) {
                                System.out.println("Barang yang anda cari ada di dalam gudang");
                            } else {
                                System.out.println("Barang yang anda cari tidak ada di dalam gudang");	
                            }
                            break;
                    
                        default:
                            System.out.println("Error, Coba Lagi!!");
                            break;
                    }
                    break;

                case 0:
                    System.exit(pilihan);
                    break;
            
                default:
                    System.out.println("Error, Coba Lagi!!");
                    break;
            }
        }
    }
}