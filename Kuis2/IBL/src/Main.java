import java.util.*;

public class Main {
    public static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("+------------------------------+");
        System.out.println("|------------ MENU ------------|");
        System.out.println("|------------------------------|");
        System.out.println("| 1. Tampilkan Klasemen        |");
        System.out.println("| 2. Tambah Data Klub IBL      |");
        System.out.println("| 3. Hapus Data Klub IBL       |");
        System.out.println("| 4. Pencarian Data Klub       |");
        System.out.println("| 0. Keluar                    |");
        System.out.println("+------------------------------+");
        System.out.print("Masukkan pilihan anda: ");
        int menu = sc.nextInt();
        return menu;
    }

    public static Klub inputKlub() {
        System.out.println("*********************");
        System.out.println("** INPUT DATA KLUB **");
        System.out.println("*********************");
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama klub: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan jumlah menang: ");
        int menang = sc.nextInt();
        System.out.print("Masukkan jumlah kalah: ");
        int kalah = sc.nextInt();
        System.out.print("Masukkan poin difference: ");
        int diff = sc.nextInt();
        System.out.println();
        return new Klub(nama, menang, kalah, diff);
    }

    public static int removeKlub() {
        Scanner sc = new Scanner(System.in);
        System.out.println("*********************");
        System.out.println("** HAPUS DATA KLUB **");
        System.out.println("*********************");
        System.out.print("Masukkan rank klub: ");
        int rank = sc.nextInt();
        return rank;
    }

    public static int searchName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan rank klub: ");
        int rank = sc.nextInt();
        System.out.println();
        return rank;
    }

    public static String searchRank() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama klub [nama harus sama]: ");
        String rank = sc.nextLine();
        System.out.println();
        return rank;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("********************************");
        System.out.println("** Liga Bola Basket Indonesia **");
        System.out.println("********************************\n");
        DLL dll = new DLL();
        
        // add data klasemen
        dll.add(new Klub("Prawira", 27, 3, 439));
        dll.add(new Klub("Satria Muda", 27, 3, 337));
        dll.add(new Klub("Pelita Jaya", 27, 3, 374));
        dll.add(new Klub("Dewa united", 20, 10, 169));
        dll.add(new Klub("RANS Simba", 19, 11, 92));
        dll.add(new Klub("Bima Perkasa", 18, 12, 98));
        dll.add(new Klub("Bali United", 15, 15, 145));
        dll.add(new Klub("Bumi Borneo", 15, 15, 8));
        dll.add(new Klub("Hawks", 13, 17, -43));
        dll.add(new Klub("Indonesia Patriots", 12, 18, -41));
        dll.add(new Klub("Hangtuah", 12, 18, -147));
        dll.add(new Klub("Evos Thunder", 11, 19, -158));
        dll.add(new Klub("West Bandits", 8, 22, -274));
        dll.add(new Klub("NSH Mountain", 6, 24, -299));
        dll.add(new Klub("Pacific Caesar", 6, 24, -309));
        dll.add(new Klub("Satya Wacana", 4, 26, -391));

        while(true) {
            dll.sorting();
            int menu = menu();
            System.out.println();
            switch (menu) {
                case 1:
                    dll.print();
                    break;

                case 2:
                    dll.add(inputKlub());
                    break;

                case 3:
                    dll.remove(removeKlub());
                    break;
                    
                case 4:
                    System.out.println("+-------------------------------+");
                    System.out.println("|---------Menu Pencarian--------|");
                    System.out.println("|-------------------------------|");
                    System.out.println("| 1. Pencarian berdasarkan rank |");
                    System.out.println("| 2. Pencarian berdasarkan nama |");
                    System.out.println("+-------------------------------+");
                    System.out.print("Masukkan pilihan anda: ");
                    int searchMenu = sc.nextInt();
                    switch (searchMenu) {
                        case 1:
                            dll.searchName(searchName());
                            break;

                        case 2:
                            dll.searchRank(searchRank());
                            break;
                    
                        default:
                            System.out.println("Pilihan yang anda masukkan salah!");
                            break;
                    }
                    break;

                case 0:
                    System.exit(0);
                    break;
            
                default:
                    System.out.println("Inputan salah!, Coba Lagi!!");
                    break;         
            }
        }
    }
}