import List.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Now is working here....");
        LinkedList myLinkedList = new LinkedList(0);
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(3);



        myLinkedList.printList();
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
    }
}