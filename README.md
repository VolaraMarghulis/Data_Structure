# Data Structures and Algorithm


## Linked List

![Linked List](\asserts\LinkedList.png)

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

![](\asserts\Stack.png)

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