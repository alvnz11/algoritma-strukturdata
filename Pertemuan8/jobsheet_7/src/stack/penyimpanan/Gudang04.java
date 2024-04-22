package stack.penyimpanan;

public class Gudang04 {
    Barang04[] tumpukan;
    int size;
    int top;

    public Gudang04(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang04[kapasitas];
        top = -1;
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if(top == (size - 1)) {
            return true;
        } else {
            return false;
        }
    }

    // Push
    public void tambahBarang(Barang04 brg) {
        if(!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " Berhasil ditambahkan ke Gudang");
        } else {
            System.out.println("Gagal!, Tumpukan barang di Gudang sudah penuh");
        }
    }

    // Pop
    public Barang04 ambilBarang() {
        if(!cekKosong()) {
            Barang04 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari Gudang");
            System.out.println("Kode unik dalam biner : " + konversiDesimalkeBiner(delete.kode));
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    // Peek
    public Barang04 lihatBarangTop() {
        if(!cekKosong()) {
            Barang04 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas : " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    // soal latihan
    public Barang04 lihatBarangTerbawah() {
        if(!cekKosong()) {
            System.out.println("Barang terbawah : " + tumpukan[0].nama);
            return tumpukan[0];
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public void tampilkanBarang() {
        if(!cekKosong()) {
            System.out.println("Rincian tumpukan barang di Gudang : ");
            for(int i = top; i >= 0; i--) {
                System.out.printf("Kode %d : %s (Kategori %s)\n", tumpukan[i]. kode, 
                tumpukan[i].nama, tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong");
        }
    }

    public String konversiDesimalkeBiner(int kode) {
        StackKonversi04 stack = new StackKonversi04();
        while (kode != 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }

    public boolean cariKodeBarang(int cari) {
        for(int i = 0; i < tumpukan.length; i++) {
            if(tumpukan[i].kode == cari) {
                return true;
            }
        }
        return false;
    }

    public boolean cariNamaBarang(String cari) {
        for(int i = 0; i < tumpukan.length; i++) {
            if(tumpukan[i].nama.equalsIgnoreCase(cari)) {
                return true;
            }
        }
        return false;
    }
}
