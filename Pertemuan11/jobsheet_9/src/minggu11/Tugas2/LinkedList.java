package minggu11.Tugas2;

public class LinkedList {
    Node head, tail;

    boolean isEmpty() {
        if(head != null) {
            return false;
        } else {
            return true;
        }
    }

    void print() {
        if(!isEmpty()) {
            Node temp = head;
            System.out.println("\t====Data Mahasiswa====");
            System.out.println("Antrian\t\tNIM\t\tNAMA");
            System.out.println("---------------------------------------------");
            int i = 1;
            while (temp != null) {
                System.out.println(i + "\t\t" + temp.data.nim + "\t\t" + temp.data.nama + "\t");
                temp = temp.next;
                i++;
            }
            System.out.println("");
        } else {
            System.out.println("Antrian Masih Kosong!!");
        }
    }

    void removeFirst() {
        if(!isEmpty()) {
            head = head.next;
            System.out.println("Antrian Berhasil Dikeluarkan!!");
        } else if (head == tail) {
            head = tail = null;
            System.out.println("Antrian Berhasil Dikeluarkan!!");
        } else {
            System.out.println("Antrian masih kosong, tidak dapat dihapus!!");
        }
    }

    void addLast(Mahasiswa input) {
        Node ndInput = new Node(input, null);
        if(isEmpty()) {
            head = ndInput;
            tail = ndInput;
            System.out.println("Antrian Berhasil Ditambahkan!!");
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    Mahasiswa getData(int index) {
        Node tmp = head;
        for(int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    void peekData(int i){
        if(i == 1) {
            System.out.println("Antrian Paling Depan: " + head.data.nim + " " + head.data.nama);
        } else if (i == 2) {
            System.out.println("Antrian Paling Belakang: " + tail.data.nim + " " + tail.data.nama);
        }
    }

    int indexOf(String key) {
        Node tmp  = head;
        int index = 0;
        while (tmp != null && !tmp.data.nama.equalsIgnoreCase(key)) {
            tmp = tmp.next;
            index++;
        }
        if(tmp == null) {
            return 1;
        } else {
            return index+1;
        }
    }
}
