package Percobaan2;

public class BinaryTreeMain04 {
    public static void main(String[] args) {
        BinaryTreeArray04 bta = new BinaryTreeArray04();
        int[] data = {6, 4, 8, 3, 5, 7, 9,0, 0, 0};
        int idxLast = 6;
        bta.populateData(data, idxLast);
        System.out.print("\nInOrder Traversal: ");
        bta.traverseInOrder(0);
        System.out.println("");

        System.out.print("\nPreOrder Traversal: ");
        bta.traversePreOrder(0);
        System.out.println("");

        System.out.print("\nPostOrder Traversal: ");
        bta.traversePostOrder(0);
        bta.add(19);
        System.out.println("");
    }
}
