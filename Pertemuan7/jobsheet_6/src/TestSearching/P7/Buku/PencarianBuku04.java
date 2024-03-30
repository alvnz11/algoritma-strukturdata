package TestSearching.P7.Buku;

public class PencarianBuku04 {
    Buku04 listBk[] = new Buku04[5];
    int idx;

    void tambah(Buku04 m) {
        if(idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data Sudah Penuh!!");
        }
    }

    void tampil() {
        for(Buku04 m : listBk) {
            m.tampilDataBuku();
        }
    }

    public int findSeqSearch(int cari) {
        int posisi = -1;
        for(int j = 0; j < listBk.length; j++) {
            if(listBk[j].kodeBuku == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void tampilPosisi(int x, int pos) {
        if(pos != -1) {
            System.out.println("Data : " + x + " ditemukan pada index " + pos);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    public void tampilData(int x, int pos) {
        if(pos != -1) {
            System.out.println("Kode buku \t: " + x);
            System.out.println("Judul buku \t: " + listBk[pos].judulBuku);
            System.out.println("Tahun terbit \t: " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang \t: " + listBk[pos].pengarang);
            System.out.println("Stock \t\t: " + listBk[pos].stock);
        } else {
            System.out.println("--Tidak Dapat Menampilkan Data Buku Karena Data Buku Tidak Ditemukan--");
        }
    }
}
 