class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class StackUsingLinkedList {
    private Node top;  // Top node of the stack

    public StackUsingLinkedList() {
        top = null;  // Initialize top to null when the stack is empty
    }

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;  // Set the new node's next to the current top
        top = newNode;       // Update top to the new node
    }

    public int pop() {
        if (top != null) {
            int poppedValue = top.data;  // Get the data from the top node
            top = top.next;              // Move top to the next node
            return poppedValue;
        } else {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;  // Return a default value to indicate stack underflow
        }
    }

    public int peek() {
        if (top != null) {
            return top.data;  // Return the data from the top node
        } else {
            System.out.println("Stack is empty. Cannot peek.");
            return -1;  // Return a default value to indicate stack underflow
        }
    }

    public boolean isEmpty() {
        return top == null;  // Stack is empty when top is null
    }

    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
