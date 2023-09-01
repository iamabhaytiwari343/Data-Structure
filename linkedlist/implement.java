
import java.util.*;

class node<val> {
    val a;
    node next;

    node(val a) {
        this.a = a;
        this.next = null;
    }

}

public class implement {
    public static void main(String args[]) {
        node<Integer> head = new node<>(1);
        head.next = new node<>(2);
        head.next.next = new node<>(3);
        head.next.next.next = new node<>(4);
        node current = head;
        while (current.next != null) {
            System.out.print(current.a + "  ");
            current = current.next;
        }
        System.out.print(current.a);

    }
}
