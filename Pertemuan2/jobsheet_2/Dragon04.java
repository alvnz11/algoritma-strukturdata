package Pertemuan2.jobsheet_2;

public class Dragon04 {
    int x = 5, y = 5, width = 10, height = 10;

    public Dragon04() {
        System.out.println("Selamat Datang di Permainan Naga\n");
        System.out.println("Pilihan Langkah ");
        System.out.println("U = Up    D = Down\nL = Left  R = Right\n");
        System.out.println("Posisi Awal Anda");
        System.out.println("X = " + x + "\t Y = " + y);
    }

    void moveLeft() {
        x -= 1;
        if(x < 0 || x > width) {
            detectCollision(x, y);
        }
        System.out.println("X = " + x + "\t Y = " + y);
    }

    void moveRight() {
        x += 1;
        if(x < 0 || x > width) {
            detectCollision(x, y);
        }
        System.out.println("X = " + x + "\t Y = " + y);
    }

    void moveUp() {
        y += 1;
        if (y < 0 || y > height) {
            detectCollision(x, y);
        }
        System.out.println("X = " + x + "\t Y = " + y);
    }
    
    void moveDown() {
        y -= 1;
        if (y < 0 || y > height) {
            detectCollision(x, y);
        }
        System.out.println("X = " + x + "\t Y = " + y);
    }

    void printPosition() {
        System.out.println("X = " + x + "\t Y = " + y);
    }

    void detectCollision(int x, int y) {
        System.out.println("GAME OVER");
        System.out.println("Posisi Anda Melebihi Batas, Anda Mati!");
    }
}
