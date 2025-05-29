package binarySearchTree;

public class BinarySearchTree {
    public Node root; // <---- root node


    class Node {
        public int value; // value stored in the node
        public Node left; // pointer to left
        public Node right; // pointer to right
        //Node constructor
        Node(int value) {
            this.value = value;
        }
    }
    //<-------------- method to insert a value into the
    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) { //<------- if tree is empty, set as the new node
            root = newNode;
            return true;
        }
        Node temp = root; // <----- start traversal from root
        while (true) {
            if (newNode.value == temp.value) return false; // <---- avoid duplicate values
            if (newNode.value < temp.value) { // <---- Move to the left subtree
                if (temp.left == null) {  // <---- // if left child is empty, place new node here
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;  // <---- otherwise, keep traversing left
            } else {  // <---- move to the right subtree
                if (temp.right == null) { // <---- if right child is empty, place new node here
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right; // <---- otherwise, keep traversing right
            }
        }
    }
    // <----------- method to search for a value
    public boolean contains(int value) {
        if (root == null) return false; // <---- if tree is empty, return false
        Node temp = root; // <---- start traversal from root
        while (temp != null) {
            if (value < temp.value) { // <---- move to the left subtree
                temp = temp.left;
            } else if (value > temp.value) { // <---- move to the right subtree
                temp = temp.right;
            } else {
                return true; // <---- value found
            }
        }
        return false; // <---- value not found in the tree
    }
}
