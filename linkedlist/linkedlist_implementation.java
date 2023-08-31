import java.io.*;

class ListNode {
    int head;
    ListNode next;

    ListNode(int val) {
        this.head = val;
        this.next = null;
    }
}

public class linkedlist_implementation {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        ListNode current = head;
        while (current != null) {
            System.out.print(current.head + " ");
            current = current.next;
        }
    }
}
