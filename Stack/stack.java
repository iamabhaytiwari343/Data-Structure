
// import java.io.*;

public class stack {
    private int maxSize; // Maximum size of the stack
    private int top; // Index of the top element
    private int[] stackArray; // Array to store the elements

    stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // Initialize top to -1 when the stack is empty
    }

    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value; // Increment top and add the value to the stack
        } else {
            System.out.println("Stack is full. Cannot push " + value);
        }
    }

    public int pop() {
        if (top >= 0) {
            return stackArray[top--]; // Return the top element and decrement top
        } else {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // Return a default value to indicate stack underflow
        }
    }

    public int peek() {
        if (top >= 0) {
            return stackArray[top]; // Return the top element without removing it
        } else {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; // Return a default value to indicate stack underflow
        }
    }

    public boolean isEmpty() {
        return top == -1; // Stack is empty when top is -1
    }

    public boolean isFull() {
        return top == maxSize - 1; // Stack is full when top is equal to maxSize - 1
    }

    public static void main(String[] args) {
        stack stack = new stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Is stack full? " + stack.isFull());
    }
}
