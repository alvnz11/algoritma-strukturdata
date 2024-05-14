package Tugas2;

public class Node {
    Film data;
    Node next, prev;

    Node(Node prev, Film data, Node next) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}
