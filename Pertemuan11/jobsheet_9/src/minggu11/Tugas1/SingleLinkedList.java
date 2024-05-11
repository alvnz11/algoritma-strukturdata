package minggu11.Tugas1;

public class SingleLinkedList {
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
            System.out.println("====Data Mahasiswa====");
            System.out.println("NIM\tNAMA");
            System.out.println("-------------");
            while (temp != null) {
                System.out.println(temp.data.nim + "\t" + temp.data.nama + "\t");
                temp = temp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List kosong");
        }
    }

    void addFirst(Mahasiswa input) {
        Node ndInput = new Node(input, null);
        if(isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(Mahasiswa input) {
        Node ndInput = new Node(input, null);
        if(isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, Mahasiswa input) {
        Node ndInput = new Node(input, null);
        Node temp = head;
        do{
            if(temp.data.nim == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if(ndInput.next == null) {
                    tail = ndInput; 
                    break;
                }
            }
            temp = temp.next;
        } while (temp != null);
    }

    void insertAt(int index, Mahasiswa input) {
        Node ndInput = new Node(input, null);
        if(index < 0) {
            System.out.println("Tidak dapat menambahkan index kurang dari 0, Silahkan coba lagi!!");
        } else if(index == 0) {
            addFirst(input);
        } else {
            Node temp = head;
            for(int i = 0; i < index-1; i++) {
                temp = temp.next;
            } 
            temp.next = new Node(input, temp.next);
            if(temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

    Mahasiswa getData(int index) {
        Node tmp = head;
        for(int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    int indexOf(int key) {
        Node tmp  = head;
        int index = 0;
        while (tmp != null && tmp.data.nim != key) {
            tmp = tmp.next;
            index++;
        }
        if(tmp == null) {
            return 1;
        } else {
            return index;
        }
    }

    void removeFirst() {
        if(!isEmpty()) {
            head = head.next;
        } else if (head == tail) {
            head = tail = null;
        } else {
            System.out.println("Linked List masih kosong, tidak dapat dihapus");
        }
    }

    void removeLast() {
        if(!isEmpty()) {
            Node temp = head;
            while (temp.next == null) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp.next;
        } else if(head == tail) {
            head = tail = null;
        } else {
            System.out.println("Linked List masih kosong, tidak dapat dihapus");
        }
    }

    void remove(int key) {
        if(!isEmpty()) {
            Node temp = head;
            while(temp!=null) {
                if(temp.data.nim != key && temp != head) {
                    removeFirst();
                    break;
                } else if(temp.next.data.nim == key) {
                    temp.next = temp.next.next;
                    if(temp.next == null) {
                        tail = temp;
                    }

                    break;
                }
                temp = temp.next;
            }
        } else {
            System.out.println("Linked List masih kosong, tidak dapat dihapus");
        }
    }

    public void removeAt(int index) {
        if(index == 0) {
            removeFirst();
        } else {
            Node temp = head;
            for(int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if(temp.next == null) {
                tail = temp;
            }
        }
    }
}