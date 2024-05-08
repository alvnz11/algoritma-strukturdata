package Warung;

public class Queue {
    Pembeli[] antrian;
    int front;
    int rear;
    int size;
    int max;

    public Queue(int n) {
        max = n;
        antrian = new Pembeli[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if(!isEmpty()) {
            System.out.println("Antrian terdepan : " + antrian[front].nama + " " + antrian[front].noHP);
        } else {
            System.out.println("Antrian masih kosong!");
        }
    }

    public void peekRear() {
        if(!isEmpty()) {
            System.out.println("Antrian paling belakang: " + antrian[rear].nama + " " + antrian[rear].noHP);
        } else {
            System.out.println("Antrian masih kosong!");
        }
    }

    public void print() {
        if(isEmpty()) {
           System.out.println("Antrian masih kosong!"); 
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nama + " " + antrian[i].noHP);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama + " " + antrian[i].noHP);
            System.out.println("Jumlah  : " + size);
        }
    }

    public void clear() {
        if(!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan!");
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void enqueue(Pembeli dt) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh");
        } else {
            if(isEmpty()) {
                front = rear = 0;
            } else {
                if(rear == max-1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            antrian[rear] = dt;
            size++;
        }
    }

    public Pembeli dequeue() {
        Pembeli dt = null;
        if(isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            dt = antrian[front];
            size--;
            if (front == rear) {
                front = rear = -1;
            } else {
               for (int i = front; i < rear; i++) {
                   antrian[i] = antrian[i+1];
               }
               rear--;
            }
        }
        return dt;
    }

    public void peekPosition(String nama) {
        int pos = -1;
        for(int i = 0; i < size; i++) {
            if(antrian[i].nama.equalsIgnoreCase(nama)) {
                pos = i;
                break;
            }
        }

        if(pos == -1) {
            System.out.println("Antrian tidak ditemukan!!");
        } else {
            System.out.println("Posisi pada antrian : " + (pos + 1));
        }
    }

}
