package Praktikum1;

import java.util.*;

public class QueueMain {
    public static void menu() {
        System.out.println("Masukkan Operasi Yang Diinginkan:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peak");
        System.out.println("5. Clear");
        System.out.println("-------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pilih;

        System.out.print("Masukkan kapasitas Queue : ");
        int n = sc.nextInt();

        Queue04 Q = new Queue04(n);

        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data baru : ");
                    int dataMasuk = sc.nextInt();
                    Q.enqueue(dataMasuk);
                    break;

                case 2:
                    int dataKeluar = Q.dequeue();
                    if(dataKeluar != 0) {
                        System.out.println("Data yang dikeluarkan: " + dataKeluar);
                    }
                    break;

                case 3:
                    Q.print();
                    break;

                case 4:
                    Q.peek();
                    break;

                case 5:
                    Q.clear();
                    break;
            }

            if (Q.isOverflow == true || Q.isUnderflow == true) {
                break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}
