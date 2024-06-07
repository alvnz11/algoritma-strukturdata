package Praktikum;

public class DoubleLinkedList04 {
    Node04 head;
    int size;

    DoubleLinkedList04() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }
    public void addFirst(int item, int jarak) {
        if(isEmpty()) {
            head = new Node04(null, item, jarak, null);
        } else {
            Node04 newNode = new Node04(null, item, jarak, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public int getJarak(int index) throws Exception {
        if(isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node04 tmp = head;
        for(int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.jarak;
    }

    public void remove(int index) {
        Node04 current = head;
        while(current != null) {
            if(current.data == index) {
                if(current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if(current.next != null) {
                    current.next.prev = current.prev;
                }
                break;
            }
            current = current.next;
        }
        size--;
    }

    public int get(int index) throws Exception {
        if (index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node04 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void updateJarak(int tujuan, int jarakBaru) throws Exception {
        Node04 current = head;
        boolean cek = false;
        while (current != null) {
            if (current.data == tujuan) {
                current.jarak = jarakBaru;
                cek = true;
                break;
            }
            current = current.next;
        }
        if (!cek) {
            throw new Exception("Tujuan tidak ditemukan dalam daftar");
        }
    }
}
