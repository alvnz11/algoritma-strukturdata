package Pertemuan3.jobsheet_3.arrayBalok;

public class balok {
    public int panjang;
    public int lebar;
    public int tinggi;

    public balok(int p, int l, int t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    public int hitungVolume() {
        return panjang * lebar * tinggi;
    }

    public static void main(String[] args) {
        balok[] biArray = new balok[3];

        biArray[0] = new balok(100, 30, 12);
        biArray[1] = new balok(120, 40, 15);
        biArray[2] = new balok(210, 50, 25);

        for(int i = 0; i < 3; i++) {
            System.out.println("Volume balok ke-" + i + ": " + biArray[i].hitungVolume());
        }
    }
}
