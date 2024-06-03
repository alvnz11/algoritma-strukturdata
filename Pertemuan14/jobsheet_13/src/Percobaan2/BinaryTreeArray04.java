package Percobaan2;

public class BinaryTreeArray04 {
    int[] data;
    int idxLast;

    public BinaryTreeArray04() {
        data = new int[10];
    }

    void populateData(int data[], int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if(idxStart <= idxLast) {
            traverseInOrder(2*idxStart+1);
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2*idxStart+2);
        }
    }

    public void add(int input) {
        data[idxLast] = input;
        idxLast++;
        
        int currentIndex = idxLast - 1;
        while (currentIndex > 0) {
            int parentIndex = (currentIndex - 1) / 2;
            if (data[currentIndex] < data[parentIndex]) {
                int temp = data[currentIndex];
                data[currentIndex] = data[parentIndex];
                data[parentIndex] = temp;
                currentIndex = parentIndex;
            } else {
                break;
            }
        }
    }

    void traversePreOrder(int idxStart) {
        if(idxStart <= idxLast) {
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2*idxStart+1);
            traverseInOrder(2*idxStart+2);
        }
    }

    void traversePostOrder(int idxStart) {
        if(idxStart <= idxLast) {
            traverseInOrder(2*idxStart+1);
            traverseInOrder(2*idxStart+2);
            System.out.print(data[idxStart] + " ");
        }
    }
}
