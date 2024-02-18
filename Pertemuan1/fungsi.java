public class fungsi {

    static int[][] stockBunga = {
            {10, 5, 15, 7}, // RoyalGarden1
            {6, 11, 9, 12}, // RoyalGarden2
            {2, 10, 10, 5}, // RoyalGarden3
            {5, 7, 12, 9}   // RoyalGarden4
        };

    static int[] hargaBunga = {75000, 50000, 60000, 10000};
    static int[] totCabang = new int[4];
    static int[] penguranganStok = {-1, -2, 0, -5};

    static void pendapatan() {
        System.out.println("PENDAPATAN SETIAP CABANG");
        System.out.println("===========================");
        for (int i = 0; i < stockBunga.length; i++) {
            for(int j = 0; j < stockBunga[0].length; j++) {
                totCabang[i] += stockBunga[i][j] * hargaBunga[j];
            }
            System.out.println("RoyalGarden " + (i + 1) + " = Rp." + totCabang[i]);
        }
        System.out.println();
    }

    static void stockCab4() {
        System.out.println("Stok  Bunga RoyalGarden 4");
        System.out.println("===========================");
        System.out.println("Sebelum Terdapat pengurangan stok");
        System.out.println("------------------------------------------------");
        System.out.printf("| %8s || %8s || %8s || %8s |\n", "Aglonema", "Keladi", "Alocasia", "Mawar");
        System.out.println("------------------------------------------------");
        for (int i = 0; i < stockBunga.length; i++) {
            System.out.printf("| %8s |", stockBunga[3][i]);
        }
        
        // Mengurangi Stok Bunga
        for (int i = 0; i < stockBunga.length; i++) {
            stockBunga[3][i] += penguranganStok[i];
        }

        System.out.println("\n\nSetelah Terdapat pengurangan stok");
        System.out.println("------------------------------------------------");
        System.out.printf("| %8s || %8s || %8s || %8s |\n", "Aglonema", "Keladi", "Alocasia", "Mawar");
        System.out.println("------------------------------------------------");
        for (int i = 0; i < stockBunga.length; i++) {
            System.out.printf("| %8s |", stockBunga[3][i]);
        }
    }

    public static void main(String[] args) {
        pendapatan();
        stockCab4();
    }
}
