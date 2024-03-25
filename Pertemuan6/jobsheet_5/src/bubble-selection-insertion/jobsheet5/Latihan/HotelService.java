package Latihan;

import Mahasiswa.Mahasiswa;

public class HotelService {
    Hotel[] listHot = new Hotel[5];
    int index;

    void tambah(Hotel h) {
        if(index < listHot.length) {
            listHot[index] = h;
            index++;
        } else {
            System.out.println("Data Sudah Penuh!!");
        }
    }

    void tampilAll() {
        for(Hotel h : listHot) {
            h.tampil();
            System.out.println("--------------------------");
        }
    }

    void bubbleHarga() {
        for(int i = 0; i < listHot.length-1; i++) {
            for(int j = 1; j < listHot.length-i; j++) {
                if(listHot[j].harga < listHot[j-1].harga) {
                    Hotel tmp = listHot[j];
                    listHot[j] = listHot[j-1];
                    listHot[j-1] = tmp;
                }
            }
        }
    }

    void bubbleRating() {
        for(int i = 0; i < listHot.length-1; i++) {
            for(int j = 1; j < listHot.length-i; j++) {
                if(listHot[j].bintang > listHot[j-1].bintang) {
                    Hotel tmp = listHot[j];
                    listHot[j] = listHot[j-1];
                    listHot[j-1] = tmp;
                }
            }
        }
    }

    void selectionHarga() {
        for(int i = 0; i < listHot.length-1; i++) {
            int idxMin = i;
            for(int j = i+1; j < listHot.length; j++) {
                if(listHot[j].harga < listHot[idxMin].harga) {
                    idxMin = j;
                }
            }
            Hotel tmp = listHot[idxMin];
            listHot[idxMin] = listHot[i];
            listHot[i] = tmp;
        }
    }

    void selectionRating() {
        for(int i = 0; i < listHot.length-1; i++) {
            int idxMin = i;
            for(int j = i+1; j < listHot.length; j++) {
                if(listHot[j].bintang > listHot[idxMin].bintang) {
                    idxMin = j;
                }
            }
            Hotel tmp = listHot[idxMin];
            listHot[idxMin] = listHot[i];
            listHot[i] = tmp;
        }
    }

}
