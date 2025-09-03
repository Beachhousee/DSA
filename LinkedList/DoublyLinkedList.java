
public class DoublyLinkedList {
    // Node class for Doubly Linked List
    public static class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

    // Display list in forward direction
    public static void displayForward(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Display list in reverse direction
    public static void displayReverse(Node tail) {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    public static void display2(Node random) {
        Node temp = random;
        while (temp.prev != null) {
            temp = temp.prev;
        }
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println();

    }

    public static Node insertAtHead(Node head, int x) {
        Node t = new Node(30);
        t.next = head;
        head.prev = t;
        head = t;
        return head;
    }

    public static void insertAtIdx(Node head, int idx, int x) {
        Node s = head;
        for (int i = 1; i < idx - 1; i++) {
            s = s.next;
        }
        // s is at idx-1 position
        Node r = s.next; // idx
        Node t = new Node(x);
        // s t r
        s.next = t;
        t.prev = s;
        t.next = r;
        r.prev = t;
    }

    public static void main(String[] args) {
        // Creating nodes
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);

        // Linking nodes
        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;

        // Display list in both directions
        System.out.println("Forward traversal:");
        displayForward(a);
        System.out.println("\nReverse traversal:");
        displayReverse(e);
        display2(d);
        Node newHead = insertAtHead(a, 35);
        displayForward(newHead);
        insertAtIdx(a, 3, 56);
    }
}