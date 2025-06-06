# Data Structures and Algorithm


## Linked List

![Image](https://github.com/user-attachments/assets/ccf38414-38ac-4bb8-83d9-da01b3d31910)

```Java
Structure :

private class Node{
    int value;  // <----------- point to the next node
    Node next; // <---------- value
    // <------------------------ node constructor ()
    Node(int value){
    this.value = value;
    }
}
    //<------------------------ methods
void printList();
void getHead();
void getTail();
void getLength();
Node removeLast();
Node removeFirst();
void append(int value);
void prepend(int value);
Node get(int index);
boolean set(int index, int value);
boolean insert(int index, int value);
Node remove(int index);
```

## Stack

![Image](https://github.com/user-attachments/assets/f378087b-c128-4d5c-8a1e-4d1fbcf0d353)

``` Java
Structure:

class Node {
        int value;  // <---------- value
        Node next; // <----------- point to the next node
        // <---------- node constructor ()
        Node(int value) {
            this.value = value;
        }
    }
 public Stack(int value) {
        Node newNode = new Node(value); // <-------- create and call constructor node ()
        top = newNode;  // <-------- point to the first node created
        height = 1;
    }
    //<------------------------ methods
void printStack();
void getTop();
void getHeight();
void push (int value);
Node pop();
```

# Queue

![](\asserts\queue.png)

```java
class Node {
        int value; // <---------- value
        Node next; // <----------- point to the next
        // <---------- node constructor ()
        Node(int value) {
            this.value = value;
        }
    }
     //<------------------------ methods
void printQueue();
void getFirst();
void getLast();
void getLength();
void enqueue(int value);
Node dequeue ();
```
