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

    public void add(Klub item) {
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
        // System.out.println("Antrian Berhasil Ditambahkan!!!");
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 1) {
            head = head.next;
            head.prev = null;
            size--;
        } else {
            Node current = head;
            int i = 1;
            while(i < index) {
                current = current.next;
                i++;
            }
            System.out.println(current.data.nama + " pada rank ke-" + index + " telah dihapus.\n");
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

    public void print() {
        if(isEmpty()) {
            System.out.println("Linked lists kosong");
        } else {
            Node tmp = head;
            int i = 1;
            System.out.println("**************************************************************************");
            System.out.println("***************************** KLASEMEN IBL *******************************");
            System.out.println("**************************************************************************");
            System.out.println("--------------------------------------------------------------------------");
            System.out.printf("| %-4s | %-18s | %-6s | %-6s | %-6s | %-6s | %-6s |\n", "Rank", "Tim", "Game", "Menang", "Kalah", "Poin", "Diff");
            System.out.println("--------------------------------------------------------------------------");
            while(tmp != null) {
                System.out.printf("| %-4s | %-18s | %-6s | %-6s | %-6s | %-6s | %-6s |\n", i, tmp.data.nama, tmp.data.match, tmp.data.win, tmp.data.lose, tmp.data.point, tmp.data.diff);
                tmp = tmp.next;
                i++;
            }
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("Jumlah Tim: " + (i-1) + "\n");
        }
    }

    public void sorting() {
        Node current;
        Node index;
        Klub temp;

        if (!isEmpty()) {
            current = head;
            while (current != null) {
                index = current.next;
                while (index != null) {
                    if (current.data.point < index.data.point) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    } else if(current.data.point == index.data.point){
                        if (current.data.diff < index.data.diff) {
                            temp = current.data;
                            current.data = index.data;
                            index.data = temp;
                        }
                    }
                    index = index.next;
                }
                current = current.next;
            }
        } else {
            System.out.println("Linked list masih kosong, tidak dapat mengurutkan data!");
        }
    }

    public void searchRank(String nama) {
        int posisi = -1;
        Node current = head;
        int i = 1;
        while(current != null) {
            if(current.data.nama.equalsIgnoreCase(nama)) {
                posisi = i;
                break;
            }
            current = current.next;
            i++;
        }

        if (posisi != -1) {
            System.out.println("Data Ditemukan!!");
            
            System.out.println("--------------------------------------------------------------------------");
            System.out.printf("| %-4s | %-18s | %-6s | %-6s | %-6s | %-6s | %-6s |\n", "Rank", "Tim", "Game", "Menang", "Kalah", "Poin", "Diff");
            System.out.println("--------------------------------------------------------------------------");
            System.out.printf("| %-4s | %-18s | %-6s | %-6s | %-6s | %-6s | %-6s |\n", posisi, current.data.nama, current.data.match, current.data.win, current.data.lose, current.data.point, current.data.diff);
            System.out.println("--------------------------------------------------------------------------\n");

        } else {
            System.out.println("Data Klub Tidak Ditemukan!!\n");
        }
    }
    
    public void searchName(int rank) {
        int posisi = -1;
        Node current = head;
        int i = 1;
        while(current != null) {
            if(i == rank) {
                posisi = i;
                break;
            }
            current = current.next;
            i++;
        }

        if (posisi != -1) {
            System.out.println("Data Ditemukan!!");
            
            System.out.println("--------------------------------------------------------------------------");
            System.out.printf("| %-4s | %-18s | %-6s | %-6s | %-6s | %-6s | %-6s |\n", "Rank", "Tim", "Game", "Menang", "Kalah", "Poin", "Diff");
            System.out.println("--------------------------------------------------------------------------");
            System.out.printf("| %-4s | %-18s | %-6s | %-6s | %-6s | %-6s | %-6s |\n", posisi, current.data.nama, current.data.match, current.data.win, current.data.lose, current.data.point, current.data.diff);
            System.out.println("--------------------------------------------------------------------------\n");

        } else {
            System.out.println("Data Klub Tidak Ditemukan!!\n");
        }
    }
}
