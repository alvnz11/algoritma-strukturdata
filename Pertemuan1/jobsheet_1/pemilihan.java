package jobsheet_1;
import java.util.*;

public class pemilihan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nilaiAkhir = 0;
        String nilaiHuruf;

        System.out.println("Penghitung Nilai Akhir Mahasiswa");
        System.out.println("---------------------------------");
        System.out.println("Masukkan nilai Mahasiswa (0-100)");
        System.out.print("Nilai Tugas : ");
        double tgs = input.nextDouble();
        System.out.print("Nilai Kuis : ");
        double kuis = input.nextDouble();
        System.out.print("Nilai UTS : ");
        double uts = input.nextDouble();
        System.out.print("Nilai UAS : ");
        double uas = input.nextDouble();
        System.out.println("---------------------------------");

        if (tgs <= 100 &&  tgs >= 0 && kuis <= 100 && kuis >= 0 && uts <= 100 && uts >=0 && uas <=100 && uas >= 0) {

            nilaiAkhir = tgs * 0.2 + kuis * 0.2 + uts * 0.3 + uas * 0.3;

            if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                nilaiHuruf = "A";
            } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                nilaiHuruf = "B+";
            } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                nilaiHuruf = "B";
            } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                nilaiHuruf = "C+";
            } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                nilaiHuruf = "C";
            } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }
            
            System.out.println("Nilai Akhir = " + nilaiAkhir);
            System.out.println("Nilai Huruf = " + nilaiHuruf);

        } else {
            System.out.println("Nilai Tidak Valid");
        }

        input.close();
    }
    
}
