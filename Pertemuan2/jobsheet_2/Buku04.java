package Pertemuan2.jobsheet_2;

public class Buku04 {
    String judul, pengarang;
    int halaman, stok, harga, jual;

    public Buku04() {

    }

    public Buku04(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    void tampilInformasi() {
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Jumlah Halaman : " + halaman);
        System.out.println("Sisa stok : " + stok);
        System.out.println("Harga : " + harga);
    }

    void terjual(int jml) {
        if (stok > 0) {
            jual = jml;
            stok -= jml;
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    int hitungHargaTotal() {
        return harga * jual;
    }

    int hitungDiskon() {
        if(hitungHargaTotal() >= 150000) {
            return (hitungHargaTotal() * 12/100);
        } else if(hitungHargaTotal() >= 75000 && hitungHargaTotal() < 150000) {
            return (hitungHargaTotal() * 5/100);
        } else {
            return 0;
        }
    }

    int hitungHargaBayar() {
        return  hitungHargaTotal() - hitungDiskon();
    }

}
