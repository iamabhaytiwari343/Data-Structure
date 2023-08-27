class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    private Node head; // The head of the linked list

    public LinkedList() {
        head = null; // Initialize the head to null for an empty list
    }

    public void insert(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode; // If the list is empty, set the new node as the head
        } else {
            newNode.next = head; // Set the new node's next to the current head
            head = newNode; // Update the head to the new node
        }
    }

    public void delete(int value) {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }

        if (head.data == value) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next; // Skip the node to be deleted
        } else {
            System.out.println("Node not found. Cannot delete.");
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);

        linkedList.display();
    }
}
