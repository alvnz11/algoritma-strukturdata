package Tugas1;

public class Node {
    Penerima data;
    Node next, prev;

    Node(Node prev, Penerima data, Node next) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}
