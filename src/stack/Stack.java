package stack;

public class Stack {
    private Node top; // <-------- important to know where is the top of stack
    private int height; // <------ counter

    class Node {
        int value;  // <---------- value
        Node next; // <----------- point to the next node
        // <---------- node constructor ()
        Node(int value) {
            this.value = value;
        }
    }
    // <-------- Constructor stack []
    public Stack(int value) {
        Node newNode = new Node(value); // <-------- create and call constructor node ()
        top = newNode;  // <-------- point to the first node created
        height = 1;
    }

    // <--------- methods to print all details
    public void printStack() {
        Node temp = top;  //<------ attribute to goes through the stack
        while (temp != null){
            System.out.println(temp.value); // <----- print values
            temp = temp.next;
        }
    }
    // <-------- additional details
    public void getTop(){
        System.out.println("Top: " + top.value);
    }
    public  void getHeight() {
        System.out.println("Height: " + height);
    }
    // <------- methods for manipulating the structure
    public void push (int value){
        Node newNode = new Node(value);
        if(height == 0){  // <------- check if stack is empty
            top = newNode;
        }else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }
    public Node pop() { // <------- take an element
        if (height == 0) return null;
        Node temp = top; // <-- create a data temp
        top = top.next;  // <-- give address to the bottom node
        temp.next = null; // <-- temp now has null point

        height--; // <-- decrement height
        return temp; // <-- return node
    }


}
