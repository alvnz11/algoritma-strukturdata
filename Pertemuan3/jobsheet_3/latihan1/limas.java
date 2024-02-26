package Pertemuan3.jobsheet_3.latihan1;

public class limas {
    public double a;
    public double t;

    public limas(double a, double t) {
        this.a = a;
        this.t = t;
    }

    double hitungVolume() {
        double luasAlas = a*a;
        return 0.33 * luasAlas * t;
    }

    double hitungLuasPermukaan() {
        double luasAlas = a*a;
        double luasSisiTegak = 0.5 * a * t;
        return luasAlas + (4 * luasSisiTegak);
    }
}
