# Laporan Jobsheet 12 - Graph
#### Nama : Alvanza Saputra Yudha
#### Kelas : 1-H
#### NIM : 2341720182

<hr>

# Praktikum 

* ## 2.1 Percobaan 1: Implementasi Graph menggunakan Linked List

    - Class Node04
    ```java
    public class Node04 {
        int data;
        Node04 prev, next;
        int jarak;

        Node04(Node04 prev, int data, int jarak, Node04 next) {
            this.prev = prev;
            this.data = data;
            this.next = next;
            this.jarak = jarak;
        }
    }
    ```

    - Class DoubleLinkedList04
    ```java
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
    }
    ```

    - class Graph04
    ```java
    public class Graph04 {
        int vertex;
        DoubleLinkedList04 list[];

        public Graph04(int v) {
            vertex = v;
            list = new DoubleLinkedList04[v];
            for(int i = 0; i < v; i++) {
                list[i] = new DoubleLinkedList04();
            }
        }

        public void addEdge(int asal, int tujuan, int jarak) {
            list[asal].addFirst(tujuan, jarak);
            // undirect graph
            //list[tujuan].addFirst(asal, jarak);
        }
        
        public void degree(int asal) throws Exception {
            int k , totalIn = 0, totalOut = 0;
            for(int i = 0 ; i < vertex; i++) {
                // inDegree
                for(int j = 0; j < list[i].size(); j++) {
                    if(list[i].get(j) == asal) {
                        ++totalIn;
                    }
                }
                // outDegree
                for(k = 0; k < list[asal].size(); k++) {
                    list[asal].get(k);
                }
                totalOut = k;
            }
            System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + ": " + totalIn);
            System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + ": " + totalOut);
            System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " + (totalOut + totalIn));
            // Undirect Graph
            // System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " + list[asal].size());
        }

        public void removeEdge(int asal, int tujuan) throws Exception {
            for(int i = 0; i < vertex; i++) {
                if(i == tujuan) {
                    list[asal].remove(tujuan);
                }
            }
        }

        public void removeAllEdge() {
            for(int i = 0; i < vertex; i++) {
                list[i].clear();
            }
            System.out.println("Graph berhasil dikosongkan!");
        }

        public void printGraph() throws Exception {
            for(int i = 0; i < vertex; i++) {
                if(list[i].size() > 0) {
                    System.out.println("Gedung " + (char) ('A' + i) + " terhubung dengan ");
                    for(int j = 0; j < list[i]. size(); j++) {
                        System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + " m), ");
                    }
                    System.out.println();
                }
            }
            System.out.println();
        }
    }
    ```

    - Class GraphMain04
    ```java
    public class GraphMain04 {
        public static void main(String[] args) throws Exception {
            Graph04 gedung = new Graph04(6);
            gedung.addEdge(0, 1, 50);
            gedung.addEdge(0, 2, 100);
            gedung.addEdge(1, 3, 70);
            gedung.addEdge(2, 3, 40);
            gedung.addEdge(3, 4, 60);
            gedung.addEdge(4, 5, 80);
            gedung.degree(0);
            gedung.printGraph();
            gedung.removeEdge(1, 3);
            gedung.printGraph();
        }
    }
    ```

    - Verifikasi Hasil Percobaan langkah 14

    <img src = "lampiran/out11.PNG">

    - Verifikasi Hasil Percobaan langkah 17

    <img src = "lampiran/out12.PNG">

    ### 2.1.3 Pertanyaan
1. Perbaiki kode program Anda apabila terdapat error atau hasil kompilasi kode tidak sesuai!

2. Pada class Graph, terdapat atribut list[] bertipe DoubleLinkedList. Sebutkan tujuan pembuatan variabel tersebut!
    - Tujuan pembuatan variabel ini adalah untuk menyimpan informasi tentang koneksi antara vertex dalam grafik.

3. Jelaskan alur kerja dari method removeEdge!
    - Method removeEdge digunakan untuk menghapus edge antara dua vertex dalam grafik. Menerima parameter asal dan tujuan, method ini melakukan perulangan dan menghapus edge dari list[asal] jika kondisi terpenuhi.

4. Apakah alasan pemanggilan method addFirst() untuk menambahkan data, bukan method add jenis lain saat digunakan pada method addEdge pada class Graph?
    - Untuk memastikan supaya edge yang baru berada pada head/awal node

5. Modifikasi kode program sehingga dapat dilakukan pengecekan apakah terdapat jalur antara suatu node dengan node lainnya, seperti contoh berikut (Anda dapat memanfaatkan Scanner).

    <img src = "lampiran/per1.PNG">

    - Method `cekEdge()`
    ```java
    public void cekEdge(int asal, int tujuan) throws Exception {
        boolean cek = false;
        for(int i = 0; i < list[asal].size(); i++) {
            if(list[asal].get(i) == tujuan) {
                cek = true;
            }
        }
        if(cek == true) {
            System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " bertetangga");
        } else {
            System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " tidak bertetangga");
        }
    }
    ```

    - Output

    <img src = "lampiran/out13.PNG">


* ## 2.2 Percobaan 2: Implementasi Graph menggunakan Matriks

    - class GraphMatriks04
    ```java
    public class GraphMatriks04 {
        int vertex;
        int [][] matriks;

        public GraphMatriks04(int v) {
            vertex = v;
            matriks = new int[v][v];
        }

        public void makeEdge(int asal, int tujuan, int jarak) {
            matriks[asal][tujuan] = jarak;
        }

        public void removeEdge(int asal, int tujuan) {
            matriks[asal][tujuan] = 0;
        }

        public void printGraph() {
            for(int i = 0; i < vertex; i++) {
                System.out.print("Gedung " + (char) ('A' + i) + ": ");
                for(int j = 0; j < vertex; j++) {
                    if(matriks[i][j] != -1) {
                        System.out.print("Gedung " + (char) ('A' + j) + " (" + matriks[i][j] + " m), ");
                    }
                }
                System.out.println();
            }
        }
    }
    ```

    - Tambahan Class GraphMain04
    ```java
    // Graph Matriks
    GraphMatriks04 gdg = new GraphMatriks04(4);
    gdg.makeEdge(0, 1, 50);
    gdg.makeEdge(1, 0, 60);
    gdg.makeEdge(1, 2, 70);
    gdg.makeEdge(2, 1, 80);
    gdg.makeEdge(2, 3, 40);
    gdg.makeEdge(3, 0, 90);
    gdg.printGraph();
    System.out.println("Hasil setelah penghapusan edge");
    gdg.removeEdge(2, 1);
    gdg.printGraph();
    ```

    - Verifikasi Hasil Percobaan 

    <img src = "lampiran/out21.PNG">

    ### 2.1.3 Pertanyaan
1. Perbaiki kode program Anda apabila terdapat error atau hasil kompilasi kode tidak sesuai!

2. Apa jenis graph yang digunakan pada Percobaan 2?
    - Graph Matriks 

3. Apa maksud dari dua baris kode berikut?

    <img src = "lampiran/per2.PNG">

    - Membuat edge dari gedung B ke gedung C dengan jarak 70m dan gedung C ke gedung B dengan jarak 80m

4. Modifikasi kode program sehingga terdapat method untuk menghitung degree, termasuk inDegree dan outDegree!
    - Method `degree()`
    ```java
    public void degree(int asal) {
        int totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            //indegree
            if (matriks[i][asal] != 0) {
                totalIn++;
            }
            //outdegree
            if (matriks[asal][i] != 0) {
                totalOut++;   
            }
        }
        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + " : " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + " : " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + " : " + (totalIn + totalOut));
    }
    ```

    - Output

    <img src = "lampiran/out22.PNG">
