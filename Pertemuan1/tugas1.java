import java.util.*;

public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[] kode = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};

        char[][] kota = {
            { 'B', 'A', 'N', 'T', 'E', 'N' },
            { 'J', 'A', 'K', 'A', 'R', 'T', 'A' },
            { 'B', 'A', 'N', 'D', 'U', 'N', 'G' },
            { 'C', 'I', 'R', 'E', 'B', 'O', 'N' },
            { 'B', 'O', 'G', 'O', 'R' },
            { 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N' },
            { 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G' },
            { 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A' },
            { 'M', 'A', 'L', 'A', 'N', 'G' },
            { 'T', 'E', 'G', 'A', 'L' }
        };

        System.out.print("Masukkan Kode Plat Mobil : ");
        char plat = input.next().toUpperCase().charAt(0);

        boolean n = false;

        for(int i = 0; i < kode.length; i++) {
            if(kode[i] == plat) {
                System.out.println("Nama Kota = " + String.valueOf(kota[i]));
                n = true;
            }
        }

        if(!n) {
            System.out.println("Kode Plat Tidak Ditemukan");
        }
    }
}
