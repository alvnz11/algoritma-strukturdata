package BruteForceDivideConquer.minggu5.Latihan;

public class Mobil {
    public static int maxAcce(int[] arr, int l, int r) {
        if (l == r) {
            return arr[l];
        } else {
            int mid = (l + r) / 2;
            int lMax = maxAcce(arr, l, mid);
            int rMax = maxAcce(arr, mid + 1, r);
            return perbandinganMax(lMax, rMax);
        }
    }

    public static int minAcce(int[] arr, int l, int r) {
        if (l == r) {
            return arr[l];
        } else {
            int mid = (l + r) / 2;
            int lMin = minAcce(arr, l, mid);
            int rMin = minAcce(arr, mid + 1, r);
            return perbandinganMin(lMin, rMin);
        }
    }

    public static int perbandinganMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int perbandinganMin(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static double sumTopPower(int[] arr) {
        if (arr.length == 0) {
            return 0;
        } else {
            double total = 0;
            for (int i = 0; i < arr.length; i++) {
                total += arr[i];
            }
            return total / arr.length;
        }
    }

    public static void main(String[] args) {
        int[] topAcceleration = {6816, 3921, 4360, 4058, 6255, 3700, 4180, 4180};
        int[] topPower = {728, 575, 657, 609, 703, 553, 609, 631};

        System.out.println("Top acceleration tertinggi = " + maxAcce(topAcceleration, 0, topAcceleration.length - 1));
        System.out.println("Top acceleration terendah = " + minAcce(topAcceleration, 0, topAcceleration.length - 1));
        System.out.println("Rata-Rata Top Power = " + sumTopPower(topPower));
    }
}

