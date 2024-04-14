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

        // int
    // public int findSeqSearch(int cari) {
    //     int posisi = -1;
    //     for(int j = 0; j < listBk.length; j++) {
    //         if(listBk[j].kodeBuku == cari) {
    //             posisi = j;
    //             break;
    //         }
    //     }
    //     return posisi;
    // }

        // int
    // public void tampilPosisi(int x, int pos) {
    //     if(pos != -1) {
    //         System.out.println("Data : " + x + " ditemukan pada index " + pos);
    //     } else {
    //         System.out.println("Data " + x + " tidak ditemukan");
    //     }
    // }

        // int
    // public void tampilData(int x, int pos) {
    //     if(pos != -1) {
    //         System.out.println("Kode buku \t: " + x);
    //         System.out.println("Judul buku \t: " + listBk[pos].judulBuku);
    //         System.out.println("Tahun terbit \t: " + listBk[pos].tahunTerbit);
    //         System.out.println("Pengarang \t: " + listBk[pos].pengarang);
    //         System.out.println("Stock \t\t: " + listBk[pos].stock);
    //     } else {
    //         System.out.println("--Tidak Dapat Menampilkan Data Buku Karena Data Buku Tidak Ditemukan--");
    //     }
    // }

    // public Buku04 findBuku(int cari) {
    //     int posisi = -1;
    //     for(int j = 0; j < listBk.length; j++) {
    //         if(listBk[j].kodeBuku == cari) {
    //             posisi = j;
    //             break;
    //         }
    //     }
    //     return listBk[posisi];
    // }

    // public int findBinarySearch(int cari, int left, int right) {
    //     int mid;
    //     if(right >= left) {
    //         mid = (left + right) / 2;
    //         if(cari == listBk[mid].kodeBuku) {
    //             return mid;
    //         } else if(listBk[mid].kodeBuku > cari) {
    //             return findBinarySearch(cari, left, (mid-1));
    //         } else {
    //             return findBinarySearch(cari, (mid+1), right);
    //         }
    //     }
    //     return -1;
    // }

        // String
    public int findSeqSearchString(String cari) {
        int posisi = -1;
        for(int j = 0; j < listBk.length; j++) {
            if(listBk[j].kodeBuku.equalsIgnoreCase(cari)) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

        // String
    public void tampilPosisiString(String x, int pos) {
        if(pos != -1) {
            System.out.println("Data : " + x + " ditemukan pada index " + pos);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        } 
            
    }

        // String
    public void tampilDataString(String x, int pos) {
        if(pos != -1) {
            System.out.println("Kode buku \t: " + listBk[pos].kodeBuku);
            System.out.println("Judul buku \t: " + listBk[pos].judulBuku);
            System.out.println("Tahun terbit \t: " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang \t: " + listBk[pos].pengarang);
            System.out.println("Stock \t\t: " + listBk[pos].stock);
        } else {
            System.out.println("--Tidak Dapat Menampilkan Data Buku Karena Data Buku Tidak Ditemukan--");
        }
    }

        // String
    public int findBinarySearchString(String cari, int left, int right) {
        if (right < left) {
            return -1;
        }
        int mid = (left + right) / 2;
        if (cari.equalsIgnoreCase(listBk[mid].kodeBuku)) {
            return mid;
        } else if (cari.compareTo(listBk[mid].kodeBuku) < 0) {
            return findBinarySearchString(cari, left, mid - 1);
        } else {
            return findBinarySearchString(cari, mid + 1, right);
        }
    }

        // Sorting
    void bubbleSortBuku() {
        for(int i = 0; i < listBk.length-1; i++) {
            for(int j = 1; j < listBk.length-i; j++) {
                if(listBk[j].kodeBuku.compareTo(listBk[j-1].kodeBuku) < 0) {
                    Buku04 tmp = listBk[j];
                    listBk[j] = listBk[j-1];
                    listBk[j-1] = tmp;
                }
            }
        }
    }

        // Search judul
    public int findSeqSearchJudul(String cariJudul) {
        int posisi = 0;
        for(int j = 0; j < listBk.length; j++) {
            if(listBk[j].judulBuku.equalsIgnoreCase(cariJudul)) {
                posisi = j;
            }
        }
        return posisi;
    }

        // Search judul
    public int findBinarySearchJudul(String cariJudul, int left, int right) {
        if (right < left) {
            return -1;
        }
        int mid = (left + right) / 2;
        if (cariJudul.equalsIgnoreCase(listBk[mid].judulBuku)) {
            return mid;
        } else if (cariJudul.compareTo(listBk[mid].judulBuku) < 0) {
            return findBinarySearchString(cariJudul, left, mid - 1);
        } else {
            return findBinarySearchString(cariJudul, mid + 1, right);
        }
    }
}