package TestSearching.P7.MergeSortTest;

public class MergeSortingMain04 {
    public static void main(String[] args) {
        int data[] = {10, 40, 30, 50, 70, 20, 100, 90};

        System.out.println("Sorting dengan Merge Sort");
        MergeSorting04 mSort = new MergeSorting04();
        System.out.println("Data Awal");
        mSort.printArray(data);
        mSort.mergeSort(data);
        System.out.println("Data Setelah Diurutkan");
        mSort.printArray(data);
    }
}
