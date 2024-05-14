package Tugas2;

import Latihan.Hotel;

public class DLL {
    Node head;
    int size;

    DLL() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Film item) {
        if(isEmpty()) {
            head = new Node(null, item, null);
        } else {
            Node newNode = new Node(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Film item) {
        if(isEmpty()) {
            addFirst(item);
        } else {
            Node current = head;
            while(current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(Film item, int index) throws Exception {
        if(isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Node current = head;
            int i = 1;
            while(i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node newNode = new Node(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(current.prev, item, current);
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public void print() {
        if(isEmpty()) {
            System.out.println("Linked lists kosong");
        } else {
            Node tmp = head;
            int i = 0;
            while(tmp != null) {
                System.out.print("ID: " + tmp.data.id + "\n  Judul Film: " + tmp.data.judul + "\n  Rating: " + tmp.data.rating + "\n\n");
                tmp = tmp.next;
                i++;
            }
            System.out.println("Jumlah Data: " + i);
        }
    }

    public void removeFirst() throws Exception {
        Node temp = head;
        if(isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
        System.out.println(temp.data.id + " telah dihapus.");
    }

    public void removeLast() throws Exception {
        if(isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        System.out.println(current.next.data.id + " telah dihapus.");
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 1) {
            removeFirst();
        } else {
            Node current = head;
            int i = 1;
            while(i < index) {
                current = current.next;
                i++;
            }
            System.out.println(current.data.id + " pada index ke-" + index + " telah dihapus.");
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    public void search(int id) {
        int posisi = -1;
        Node current = head;
        int i = 1;
        while(current != null) {
            if(current.data.id == id) {
                posisi = i;
                break;
            }
            current = current.next;
            i++;
        }

        if (posisi != -1) {
            System.out.println("Data Id Film: " + id + ", berada pada urutan ke-" + posisi);
            System.out.println("IDENTITAS");
            System.out.println("  ID Film: " + current.data.id);
            System.out.println("  Judul Film: " + current.data.judul);
            System.out.println("  Rating Film: " + current.data.rating);
        } else {
            System.out.println("Data Id Film: " + id + ", tidak ditemukan");
        }
    }

    public void sorting() {
        Node current;
        Node index;
        Film temp;
    
        if (!isEmpty()) {
            current = head;
            while (current != null) {
                index = current.next;
                while (index != null) {
                    if (current.data.rating < index.data.rating) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        } else {
            System.out.println("Linked list masih kosong, tidak dapat mengurutkan data!");
        }
    }

}