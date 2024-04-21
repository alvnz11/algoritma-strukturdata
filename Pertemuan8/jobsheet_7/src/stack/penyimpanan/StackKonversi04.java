package stack.penyimpanan;

public class StackKonversi04 {
    int size;
    int[] tumpukanBiner;
    int top;

    public StackKonversi04() {
        this.size = 32; // asumsi 32 bit 
        tumpukanBiner = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == (size - 1);
    }

    public void push(int data) {
        if(isFull()) {
            System.out.println("Stack Penuh");
        } else {
            top++;
            tumpukanBiner[top] = data;
        }
    }

    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack Kosong");
            return -1;
        } else {
            int data = tumpukanBiner[top];
            top--;
            return data;
        }
    }
}
