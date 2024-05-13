package doublelinkedlists;

public class Node {
    int data;
    Node next, prev;

    Node(Node prev, int data, Node next) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}
