import java.util.LinkedList;

public class Queue {
    private LinkedList<Integer> queueList;

    public Queue() {
        queueList = new LinkedList<>();
    }

    public void enqueue(int item) {
        queueList.add(item);
    }

    public int dequeue() {
        if (!isEmpty()) {
            return queueList.removeFirst();
        } else {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;  // Return a default value
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return queueList.getFirst();
        } else {
            System.out.println("Queue is empty. Cannot peek.");
            return -1;  // Return a default value
        }
    }

    public boolean isEmpty() {
        return queueList.isEmpty();
    }

    public int size() {
        return
