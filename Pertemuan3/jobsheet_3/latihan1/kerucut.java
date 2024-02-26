package Pertemuan3.jobsheet_3.latihan1;

import java.lang.Math;

public class kerucut {
   public double jari;
   public double sisiMiring;
   public double phi = 3.14;

   public kerucut(double r, double m) {
    jari = r;
    sisiMiring = m;
   }

   double hitungLuasPermukaan() {
    return phi * jari * (jari + sisiMiring);
   }

   double hitungVolume() {
    double t = Math.sqrt((sisiMiring * sisiMiring) - (jari * jari));
    return 0.33 * phi * jari * jari * t;
   }
}
 