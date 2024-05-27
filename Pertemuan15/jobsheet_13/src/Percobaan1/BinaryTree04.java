public class BinaryTree04 {
    Node04 root;

    public BinaryTree04() {
        root = null;
    }

    boolean isEmpty() {
        return root != null;
    }

    // void add(int data) {
    //     if(!isEmpty()) {
    //         root = new Node04(data);
    //     } else {
    //         Node04 current = root;
    //         while (true) { 
    //             if(data > current.data) {
    //                 if(current.right == null) {
    //                     current.right = new Node04(data);
    //                 } else {
    //                     current = current.right;
    //                 }
    //             } else if(data < current.data) {
    //                 if(current.left == null) {
    //                     current.left = new Node04(data);
    //                 } else {
    //                     current = current.left;
    //                 }
    //             } else {
    //                 break;
    //             }
    //         }
    //     }
    // }

    void add(int data) {
        addRekursif(root, data);
    }

    void addRekursif(Node04 node, int data) {
        if (!isEmpty()) {
            root = new Node04(data);
        } else if (data > node.data) {
            if (node.right == null) {
                node.right = new Node04(data);
            } else {
                addRekursif(node.right, data);
            }
        } else if (data < node.data) {
            if (node.left == null) {
                node.left = new Node04(data);
            } else {
                addRekursif(node.left, data);
            }
        }
    }

    boolean find(int data) {
        boolean result = false;
        Node04 current = root;
        while(current != null) {
            if(current.data == data) {
                result = true;
                break;
            } else if(data > current.data) {
                current = current.right;
            } else if(data < current.data) {
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder(Node04 node) {
        if(node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node04 node) {
        if(node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder(Node04 node) {
        if(node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    Node04 getSuccessor(Node04 del) {
        Node04 successor = del.right;
        Node04 successorParent = del;
        while(successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if(successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data) {
        if(!isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }
        // find node (current) that will be deleted
        Node04 parent = root;
        Node04 current = root;
        boolean isLeftChild = false;
        while(current != null) {
            if(current.data == data) {
                break;
            } else if(data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if(data > current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        // deletion
        if(current == null) {
            System.out.println("Couldn`t find data!");
            return;
        } else {
            // if no child, simply delete it
            if(current.left == null && current.right == null) {
                if(current == root) {
                    root = null;
                } else {
                    if(isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            // if there is 1 child (right)
            } else if(current.left == null) {
                if(current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            // if there is 2 childs    
            } else {
                Node04 successor = getSuccessor(current);
                if(current == root) {
                    root = successor;
                } else {
                    if(isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }
}