package Tugas1;

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

    public void addLast(Penerima item) {
        if(isEmpty()) {
            head = new Node(null, item, null);
            size++;
        } else {
            Node current = head;
            while(current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, item, null);
            current.next = newNode;
            size++;
        }
        System.out.println("Antrian Berhasil Ditambahkan!!!");
    }

    public void removeFirst() throws Exception {
        Node temp = head;
        if(isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            head = null;
            size--;
            // return;
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
        System.out.println(temp.data.nama + " telah selesai divaksinisasi.");
        print();
    }

    public void print() {
        if(isEmpty()) {
            System.out.println("Linked lists kosong");
        } else {
            Node tmp = head;
            int i = 0;
            System.out.println("------------------------------");
            System.out.println("Daftar Pengantri Vaksin");
            System.out.println("------------------------------");
            System.out.println("|No.\t|Nama\t|");
            while(tmp != null) {
                System.out.print("|" + tmp.data.no + "\t|" + tmp.data.nama + "\t|\n");
                tmp = tmp.next;
                i++;
            }
            System.out.println("Sisa Antrian: " + i);
        }
    }
}
