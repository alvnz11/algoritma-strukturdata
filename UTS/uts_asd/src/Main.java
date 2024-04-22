import java.util.*;

public class Main {
    static int data[] = {21, 33, 2, 15, 6, 6, 22, 14, 17, 6, 36, 27, 29, 40, 40, 5, 26};

    public static void print(){
        for(int m : data) {
            System.out.print(m + " ");
        }
    }

    static int searching(int search, int l, int r) {
        int mid;
        if(r >= l) {
            mid = (l + r) / 2;
            if(search == data[mid]) {
                return mid;
            } else if(data[mid] > search) {
                return searching(search, l, (mid-1));
            } else {
                return searching(search, (mid+1), r);
            }
        }
        return -1;
    }

    static void sorting() {
        for(int i = 1; i < data.length; i++) {
            int tmp = data[i];
            int j = i;
            while(j > 0 && data[j - 1] > tmp) {
                data[j] = data[j-1];
                j--;
            }
            data[j] = tmp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Data Awal : ");	
        print();
        sorting();
        System.out.println("\nData Setelah Sorting (Ascending): ");
        print();
        System.out.println("\n\n===============SEARCHING===============");
        System.out.print("Masukkan angka yang ingin dicari : ");
        int search = sc.nextInt();
        int pos = searching(search, 0, data.length-1);
        System.out.println("Angka yang anda cari ada pada index ke " + pos);
    }
}
