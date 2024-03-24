package BruteForceDivideConquer.minggu5.Summary;

public class Sum {
    public int elemen;
    public double keuntungan[], total;

    Sum(int elemen) {
        this.elemen = elemen;
        this.keuntungan = new double[elemen];
        this.total = 0;
    }

    double totalBF(double arr[]) {
        for(int i = 0; i < elemen; i++) {
            total = total + arr[i];
        }
        return total;
    }

    double totalDC(double arr[], int l, int r) {
        if(l==r) {
            return arr[l];
        } else if(l < r) {
            int mid = l + (r - 1) / 2;
            double lsum = totalDC(arr, l, (mid-1));
            double rsum = totalDC(arr, (mid+1), r);
            return lsum + rsum + arr[mid]; 
        }
        return 0;
    }
}
