package Pertemuan2.jobsheet_2;

public class BukuMain04 {
    public static void main(String[] args) {
        
        Buku04 bk1 = new Buku04(); // instansiasi tanpa konstruktor
        Buku04 bk2 = new Buku04("Self Reward", "Maheera Ayesha", 160, 29, 59000); // instansiasi dengan konstruktor
        Buku04 bukuAlvanza = new Buku04("Laskar Pelangi", "Andrea Hirata", 124, 25, 69000);

        // tanpa konstruktor
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        // dengan konstruktor
        bk2.terjual(11);
        bk2.tampilInformasi();

        System.out.println();
        bukuAlvanza.tampilInformasi();
        bukuAlvanza.terjual(16);
        bukuAlvanza.restock(10);
        bukuAlvanza.tampilInformasi();
        System.out.println("\nHarga Asli = Rp." + bukuAlvanza.hitungHargaTotal());
        System.out.println("Diskon = Rp." + bukuAlvanza.hitungDiskon());
        System.out.println("Harga Bayar = Rp." + bukuAlvanza.hitungHargaBayar());
    }
}
