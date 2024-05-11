package minggu11.Tugas2;

import java.util.*;

public class Main {
    public static void menu() {
        System.out.println("Pilih Menu: ");
        System.out.println("1. Antrian Baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek Antrian Terdepan");
        System.out.println("4. Cek Antrian Paling Belakang");
        System.out.println("5. Cek Semua Antrian");
        System.out.println("6. Cek Nomor Antrian Dengan Nama");
        System.out.println("7. Cek Data Dengan Nomor Antrian");
        System.out.println("0. Keluar");
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList antri = new LinkedList();

        int i = 1;

        System.out.println("=======APLIKASI ANTRIAN LAYANAN UNIT KEMAHASISWAAN=======\n");

        do{
            menu();
            int pilih = sc.nextInt();
            sc.nextLine();

            if(pilih == 0){
                break;
            }

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("NIM: ");
                    int nim = sc.nextInt();
                    sc.nextLine();
                    Mahasiswa dt = new Mahasiswa(nama, nim);
                    antri.addLast(dt);
                    i++;
                    System.out.println();
                    break;

                case 2:
                    antri.removeFirst();
                    i--;
                    System.out.println();
                    break;
                
                case 3:
                    antri.peekData(1);
                    System.out.println();
                    break; 

                case 4:
                    antri.peekData(2);
                    System.out.println();
                    break; 

                case 5:
                    System.out.println();
                    antri.print();
                    break;

                case 6:
                    System.out.print("Masukkan Nama: ");
                    String nm = sc.nextLine();
                    System.out.println("Nama: " + nm + ", ada pada antrian ke-" + antri.indexOf(nm));
                    System.out.println();
                    break;

                case 7:
                    System.out.print("Masukkan Nomor Antrian: ");
                    int idx = sc.nextInt();
                    if(idx < i){
                        Mahasiswa mh = antri.getData(idx-1);
                        System.out.println("Data pada antrian ke-" + idx);
                        System.out.println("Nama: " + mh.nama + ", NIM: " + mh.nim);
                        System.out.println();
                    } else {
                        System.out.println("Antrian ke-" + idx + " tidak ada");
                    }
                    System.out.println();
                    break;

                default:
                    System.out.println("Pilihan yang anda masukkan salah, Silahkan Coba Lagi\n");
                    break;
            }
        } while(true);
    }
}
