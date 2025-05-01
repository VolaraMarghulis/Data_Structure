package stack;

public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack(4);

        myStack.push(3);
        myStack.push(2);

        myStack.getTop();
        myStack.getHeight();
        myStack.printStack();
        System.out.println("----------------");
        myStack.pop();
        myStack.getTop();
        myStack.getHeight();
        myStack.printStack();
    }
}
