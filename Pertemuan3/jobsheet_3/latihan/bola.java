package Pertemuan3.jobsheet_3.latihan;

public class bola {
    public double jari;
    public double phi = 3.14;

    public bola(double r) {
        jari = r;
    }

    double hitungVolume() {
        return 1.33 * phi * jari * jari * jari;
    }

    double hitungLuasPermukaan() {
        return 4 * phi * jari * jari;
    }
}
