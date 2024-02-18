import java.util.Scanner;

public class array {

    static int j;
    static String[][] matkul;
    static int[] sks;
    static double[][] nilai;

    static void jumlahMatkul() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah Mata Kuliah : ");
        j = input.nextInt();
        System.out.println();

        matkul = new String[j][2];
        sks = new int[j];
        nilai = new double[j][2];
    }

    static void inputDataMK() {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < matkul.length; i++) {
            System.out.print("Masukkan Mata Kuliah " + (i + 1) + " : ");
            matkul[i][0] = input.nextLine();
            System.out.print("Masukkan Bobot SKS MK " + matkul[i][0] + " : ");
            sks[i] = input.nextInt();
            System.out.print("Masukkan Nilai MK " + matkul[i][0] + " : ");
            nilai[i][0] = input.nextDouble();
            System.out.println();
            input.nextLine();
        }
        System.out.println("=====================================================");
    }

    static int totalSKS() {
        int totSKS = 0;
        for(int i = 0; i < sks.length; i++) {
            totSKS += sks[i];
        }
        return totSKS;
    }

    static void nilaiHuruf() {
        for(int i = 0; i < j; i++) {
            if (nilai[i][0] > 80 && nilai[i][0] <= 100) {
                matkul[i][1] = "A";
                nilai[i][1] = 4.0;
            } else if (nilai[i][0] > 73 && nilai[i][0] <= 80) {
                matkul[i][1] = "B+";
                nilai[i][1] = 3.5;
            } else if (nilai[i][0] > 65 && nilai[i][0] <= 73) {
                matkul[i][1] = "B";
                nilai[i][1] = 3.0;
            } else if (nilai[i][0] > 60 && nilai[i][0] <= 65) {
                matkul[i][1] = "C+";
                nilai[i][1] = 2.5;
            } else if (nilai[i][0] > 50 && nilai[i][0] <= 60) {
                matkul[i][1] = "C";
                nilai[i][1] = 2.0;
            } else if (nilai[i][0] > 39 && nilai[i][0] <= 50) {
                matkul[i][1] = "D";
                nilai[i][1] = 1.0;
            } else {
                matkul[i][1] = "E";
                nilai[i][1] = 0;
            }
        }

        System.out.printf("| %-28s | %5s | %10s|\n", "Mata Kuliah", "Nilai", "Nilai Huruf");
        System.out.println("----------------------------------------------");
        for (int i = 0; i < j; i++) {
            System.out.printf("| %-28s | %5.2f | %10s |\n", matkul[i][0], nilai[i][0], matkul[i][1]);
        }

        
    }

    static double totalIP() {
        double nilaiAkhir = 0;

        for(int i = 0; i < j; i++) {
            nilaiAkhir += nilai[i][1] * sks[i];
        }

        return nilaiAkhir/totalSKS();
    }

    public static void main(String[] args) {
        jumlahMatkul();
        inputDataMK();
        nilaiHuruf();
        System.out.println("=====================================================");
        System.out.printf("Total IP = %.2f", totalIP());
    }
}