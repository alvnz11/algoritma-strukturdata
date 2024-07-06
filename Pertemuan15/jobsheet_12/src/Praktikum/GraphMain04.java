import java.util.Scanner;

public class GraphMain04 {
    public static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("+------------------------------+");
        System.out.println("|--------- Menu Graph ---------|");
        System.out.println("|------------------------------|");
        System.out.println("| 1. Tambahkan Edge            |");
        System.out.println("| 2. Hapus Edge                |");
        System.out.println("| 3. Hapus Semua Edge          |");
        System.out.println("| 4. Cek Degree                |");
        System.out.println("| 5. Print Graph               |");
        System.out.println("| 6. Cek Edge                  |");
        System.out.println("| 7. Update Jarak Edge         |");
        System.out.println("| 8. Cek Jumlah Edge           |");
        System.out.println("| 0. Keluar                    |");
        System.out.println("+------------------------------+");
        System.out.print("Masukkan pilihan anda: ");
        int menu = sc.nextInt();
        return menu;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Graph04 gedung = new Graph04(6);
        
        while (true) {
            int pilih = menu();
            System.out.println();
            switch (pilih) {
                case 0:
                System.exit(0);
                break;
                
                case 1:
                    System.out.println("|--------------------|");
                    System.out.println("|  MENAMBAHKAN EDGE  |");
                    System.out.println("|--------------------|\n");
                    System.out.print("Masukkan gedung asal [index dari 0]: ");
                    int asal = sc.nextInt();
                    System.out.print("Masukkan gedung tujuan [index dari 0]: ");
                    int tujuan = sc.nextInt();
                    System.out.print("Masukkan Jarak: ");
                    int jarak = sc.nextInt();
                    gedung.addEdge(asal, tujuan, jarak);
                break;

                case 2:
                    System.out.println("|--------------------|");
                    System.out.println("|   MENGHAPUS EDGE   |");
                    System.out.println("|--------------------|\n");
                    System.out.print("Masukkan gedung asal [index dari 0]: ");
                    int asal1 = sc.nextInt();
                    System.out.print("Masukkan gedung tujuan [index dari 0]: ");
                    int tujuan1 = sc.nextInt();
                    gedung.removeEdge(asal1, tujuan1);
                break;

                case 3:
                    System.out.print("Apakah anda yakin ingin menghapus semua edge? [y/n] : ");
                    char p = sc.next().charAt(0);
                    if (p == 'y') {
                        gedung.removeAllEdge();
                    } else if (p == 'n') {
                        System.out.println("Penghapusan seluruh edge dibatalkan!!");
                    }
                break;
                
                case 4:
                    System.out.println("Masukkan index gedung [index dari 0]: ");
                    int index = sc.nextInt();
                    gedung.degree(index);
                break;

                case 5:
                    gedung.printGraph();
                break;

                case 6:
                    System.out.print("Masukkan gedung asal: ");
                    int asal2 = sc.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    int tujuan2 = sc.nextInt();
                    gedung.cekEdge(asal2, tujuan2);
                break;

                case 7:
                    System.out.print("Masukkan gedung asal: ");
                    int asal3 = sc.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    int tujuan3 = sc.nextInt();
                    System.out.print("Masukkan jarak baru: ");
                    int jarakBaru = sc.nextInt();
                    gedung.updateJarak(asal3, tujuan3, jarakBaru);
                break;

                case 8:
                    gedung.hitungEdge();
                break;
            }
        }

        // // Graph Matriks
        // GraphMatriks04 gdg = new GraphMatriks04(4);
        // gdg.makeEdge(0, 1, 50);
        // gdg.makeEdge(1, 0, 60);
        // gdg.makeEdge(1, 2, 70);
        // gdg.makeEdge(2, 1, 80);
        // gdg.makeEdge(2, 3, 40);
        // gdg.makeEdge(3, 0, 90);
        // gdg.printGraph();
        // System.out.println("Hasil setelah penghapusan edge");
        // gdg.removeEdge(2, 1);
        // gdg.printGraph();
        // gdg.degree(0);
    }
}
