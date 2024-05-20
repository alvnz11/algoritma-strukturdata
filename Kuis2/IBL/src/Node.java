public class Node {
    Klub data;
    Node next, prev;

    Node(Node prev, Klub data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
