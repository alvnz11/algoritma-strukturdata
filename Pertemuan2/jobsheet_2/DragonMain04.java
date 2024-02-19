package Pertemuan2.jobsheet_2;

import java.util.*;

public class DragonMain04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Dragon04 player = new Dragon04();

        while (true) {

            if (player.x < 0 || player.y < 0 || player.x > player.width || player.y > player.height) {
                break;
            }

            System.out.print("Pilih langkah anda (U/D/L/R) : ");
            char lngkh = input.next().toUpperCase().charAt(0);
            switch (lngkh) {
                case 'U':
                    player.moveUp();
                    break;
                case 'D':
                    player.moveDown();
                    break;
                case 'L':
                    player.moveLeft();
                    break;
                case 'R':
                    player.moveRight();
                    break;
            
                default:
                    System.out.println("Input Error, Silahkan Coba Lagi!");
                    break;
            }
        }
    }
}
