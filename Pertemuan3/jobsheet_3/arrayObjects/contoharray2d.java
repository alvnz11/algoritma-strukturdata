package Pertemuan3.jobsheet_3.arrayObjects;

import java.util.*;

public class contoharray2d {
    public int nilaiASD;
    public int nilaiBasdat;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        contoharray2d[][] nilai = new contoharray2d[2][2];

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                nilai[i][j] = new contoharray2d();
            }
        }

        for(int j = 0; j < 2; j++) {
            System.out.print("Masukkan nilai " + (j+1) +  " ASD : ");
            nilai[0][j].nilaiASD = input.nextInt();
            System.out.print("Masukkan nilai " + (j+1) +  " basdat : ");
            nilai[1][j].nilaiBasdat = input.nextInt();
        }

        for(int j = 0; j < 2; j++) {
            System.out.println("Nilai " + (j+1) + " ASD = " + nilai[0][j].nilaiASD);
            System.out.println("Nilai " + (j+1) + " Basdat = " + nilai[1][j].nilaiBasdat);
        }
    }
}
    

