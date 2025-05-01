package linkedList;

public class LinkedList {
    private Node head; // first Node
    private Node tail; // last Node
    private int length;
        // <------------------------- My structure of Node
        private class Node{
           int value;
           Node next;

           Node(int value){
                this.value = value;
            }
        }
        // <------------------------- Constructor for our LinkedList
    public LinkedList(int value){
        // <------------------------- newNode call constructor Node
        Node newNode =  new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }
        //<-------------------------  method to print elements from LinkedList
    public void printList(){
         Node temp = head;
         while (temp != null){
         System.out.print(temp.value + " --> ");
          temp = temp.next;
         }
        System.out.println("null");
    }
    public void getHead() {
            System.out.println("Head: " + head.value);
        }
    public void getTail(){
            System.out.println("Tail: " + tail.value);
        }
    public void getLength(){
            System.out.println("Length: " + length);
        }
    // <------------------------------- Remove last Node
    public Node removeLast(){
            if(length == 0) return null;
            Node temp = head;
            Node pre = head;
            while ( temp.next != null){
                pre = temp;
                temp = temp.next;
            }
            tail = pre;
            tail.next = null;
            length--;
            //check after decrement;
            if (length == 0){
                head = null;
                tail = null;
            }
            return temp;
    }
    // <---------------------------- Remove First Node
    public Node removeFirst(){
            if (length == 0) return null;
            Node temp = head;
            head =head.next;
            temp.next = null;
            length--;
        if (length == 0){
            tail = null;
        }
        return temp;
    }
    // <---------------------------- Append method
    public void append(int value){
        Node newNode = new Node(value);
        //Check if List is empty
        if (length == 0){
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
        length ++;
    }
    // <-------------------------------- Prepend
    public void prepend(int value){
            Node newNode = new Node(value);
            if (length ==0) {
                head = newNode;
                tail = newNode;
            }else {
                newNode.next = head;
                head = newNode;
            }
            length ++;
    }
    // <----------------------------- Get Node by index
    public Node get(int index){
            // check the range of my LinkedList
            if (index < 0 || index >= length) return null;
            Node temp = head;
            for (int i = 0; i < index; i++){
                temp = temp.next;
            }
            return temp;
    }
    // <----------------------------- method to set Value by index
    public boolean set(int index, int value){
           // call get Method
            Node temp = get(index);
            if (temp != null){
                temp.value = value;
                return true;
            }
            return false;
    }
    // <-------------------------- method ti insert by index anywhere in List
    public  boolean insert(int index, int value){
            if (index < 0 || index > length) return false;
            if(index == 0){
                //call method prepend
                prepend(value);
                return true;
            }
            if (index == length){
            //call method append
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }
    // <------------------------- method to remove Node by index
    public Node remove(int index){
        if (index < 0 || index > length) return null;
        if(index == 0) return removeFirst();
        if (index == length - 1) return removeLast();
        Node prev = get(index - 1);
        Node temp = prev.next;

        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }
}
