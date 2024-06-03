package Praktikum;

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
