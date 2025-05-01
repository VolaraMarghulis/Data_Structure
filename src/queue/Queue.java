package queue;

class Queue {
    private Node first;  // <----- first node
    private Node last;   // <----- last node
    private int length; // <------ counter

    class Node {
        int value; // <---------- value
        Node next; // <----------- point to the next
        // <---------- node constructor ()
        Node(int value) {
            this.value = value;
        }
    }
    // <-------- Constructor stack []
    public Queue (int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }
    // <--------- methods to print all details
    public void printQueue() {
        Node temp = first;
        while (temp != null){ // <----- goes through the queue
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public void getFirst(){
        System.out.println("First: " + first.value);
    }
    public void getLast(){
        System.out.println("Last: " + last.value);
    }
    public void getLength(){
        System.out.println("Length: " + length);
    }

    // <-------- method to add element at the end
    public void enqueue(int value){
        Node newNode = new Node(value);
        if (length == 0){ // <--- check if is first element
            first = newNode;
            last = newNode;
        } else{
            last.next = newNode;
            last = newNode;
        }
        length ++;
    }
    public Node dequeue (){ // <------- take first element
        if (length == 0) return null;
        Node temp = first; // <-- create a data temp
        if (length == 1){ // <--- check if is just one node
            first = null; // <-- first point null
            last = null; // <-- last point null
        } else {
            first = first.next; // <-- give address to next node
            temp.next = null; // <-- temp point to null
        }
        length--; // <-- decrement height
        return temp; // <-- return node
    }
}
