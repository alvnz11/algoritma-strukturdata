import java.util.*;

public class perulangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input NIM : ");
        String nim = input.nextLine();
        int n = Integer.parseInt(nim.substring(nim.length() - 2));
        
        if (n < 10) {
            n += 10;
            for(int i = 1; i <= n; i++) {
                if (i == 6 || i == 10) {
                    continue;
                } else if (i % 2 == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print(i + " ");
                }
            }
        } else {
            for(int i = 1; i <= n; i++) {
                if (i == 6 || i == 10) {
                    continue;
                } else if (i % 2 == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print(i + " ");
                }
            }
        }

        input.close();
    }
}
