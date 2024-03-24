import java.util.*;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--------------------");
        System.out.print("Masukkan jumlah elemen yang dihitung: ");
        int elemen = sc.nextInt();

        Pangkat[] png = new Pangkat[elemen];
        
        for(int i = 0; i < elemen; i++) {
            png[i] = new Pangkat();
            System.out.print("Masukkan nilai yang hendak dipangkatkan: ");
            int nilai = sc.nextInt();
            System.out.print("Masukkan nilai pemangkat: ");
            int pangkat = sc.nextInt();
            png[i].nilai = nilai;
            png[i].pangkat = pangkat;
        }

        // brute force
        System.out.println("\nHasil Pangkat - Brute Force");
        for(int i = 0; i < elemen; i++) {
            System.out.println("Hasil Dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }
        
        // divide conquer
        System.out.println("\nHasil Pangkat - Divide Conquer");
        for(int i = 0; i < elemen; i++) {
            System.out.println("Hasil Dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }
    }
}
