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
            return -1; // Return a default value
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return queueList.getFirst();
        } else {
            System.out.println("Queue is empty. Cannot peek.");
            return -1; // Return a default value
        }
    }

    public boolean isEmpty() {
        return queueList.isEmpty();
    }

    public int size() {
        return queueList.size();
    }

    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Queue size: " + queue.size());
        System.out.println("Front of the queue: " + queue.peek());

        System.out.println("Dequeued item: " + queue.dequeue());
        System.out.println("Dequeued item: " + queue.dequeue());

        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
