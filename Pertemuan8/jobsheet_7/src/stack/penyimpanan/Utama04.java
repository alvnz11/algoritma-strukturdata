package stack.penyimpanan;

import java.util.*;

public class Utama04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Gudang04 gudang = new Gudang04(7);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Barang\n2. Ambil Barang\n3. Tampilkan tumpukan barang\n4. Keluar");
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
                    System.exit(pilihan);
                    break;
            
                default:
                    break;
            }
        }
    }
}
