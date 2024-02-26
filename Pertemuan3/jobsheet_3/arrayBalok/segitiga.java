package Pertemuan3.jobsheet_3.arrayBalok;

public class segitiga {
    public int alas;
    public int tinggi;
    public double c;

    public segitiga(int a, int t) {
        alas = a;
        tinggi = t;
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(t, 2));
    }

    double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    double hitungKeliling() {
        return alas + tinggi + c;
    }
    
    public static void main(String[] args) {
        segitiga[] sgArray = new segitiga[4];

        sgArray[0] = new segitiga(10, 4);
        sgArray[1] = new segitiga(20, 10);
        sgArray[2] = new segitiga(15, 6);
        sgArray[3] = new segitiga(25, 10);

        for(int i = 0; i < 4; i++) {
            System.out.println("Segitiga ke-" + i);
            System.out.printf("Luas = %.2f \nKeliling = %.2f\n\n", sgArray[i].hitungLuas(), sgArray[i].hitungKeliling());
        }
    }
}
