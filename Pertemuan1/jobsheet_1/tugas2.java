package jobsheet_1;
import java.util.Scanner;

public class tugas2 {

    static void menu() {
        Scanner input = new Scanner(System.in);

        boolean exit = false;

        while (!exit) {
            System.out.println("Silahkan pilih menu rumus!");
            System.out.println("1. Rumus Kecepatan \n2. Rumus jarak \n3. Rumus Waktu \n0. Exit");
            System.out.print("Masukkan Pilihan Anda : ");
            int menu = input.nextInt();

            switch (menu) {
                case 1:
                    kecepatan();
                    break;
                case 2:
                    jarak();
                    break;
                case 3:
                    waktu();
                    break;
                case 0:
                    exit = true;
                    break;
            
                default:
                    System.out.println("Pilihan Yang Anda Masukkan Salah, Silahkan Coba Lagi\n");
                    break;
            }

        }
    }

    static void kecepatan() {
        Scanner input = new Scanner(System.in);

        System.out.println("\nPenghitung Kecepatan");
        System.out.println("-----------------------");
        System.out.print("Masukkan Jarak (m) : ");
        double jrk = input.nextDouble();
        System.out.print("Masukkan Waktu (s) : ");
        double wkt = input.nextDouble();
        System.out.println("-----------------------");

        System.out.println(String.format("Kecepatan = %.2f m/s" , (jrk/wkt)));
        System.out.println();
    }

    static void jarak() {
        Scanner input = new Scanner(System.in);

        System.out.println("\nPenghitung Jarak");
        System.out.println("-----------------------");
        System.out.print("Masukkan Kecepatan (m/s) : ");
        double kcptn = input.nextDouble();
        System.out.print("Masukkan Waktu (s) : ");
        double wkt = input.nextDouble();
        System.out.println("-----------------------");

        System.out.println(String.format("Jarak = %.2f m" , (kcptn * wkt)));
        System.out.println();
    }

    static void waktu() {
        Scanner input = new Scanner(System.in);

        System.out.println("\nPenghitung Waktu");
        System.out.println("-----------------------");
        System.out.print("Masukkan Kecepatan (m/s) : ");
        double kcptn = input.nextDouble();
        System.out.print("Masukkan Jarak (m) : ");
        double jrk = input.nextDouble();
        System.out.println("-----------------------");

        System.out.println(String.format("Waktu = %.2f s" , (jrk/kcptn)));
        System.out.println();
    }

    public static void main(String[] args) {
        menu();
    }
}
