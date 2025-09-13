class Node {
    int data;
    Node next;

    Node(int x) {
        this.data = x;
        this.next = null;
    }
}


class AddOnetoLinkedList {
    static Node reverse(Node head) {
        Node curr = head, prev = null, next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

 
    static Node addOneUtil(Node head) {
        Node res = head;
        Node curr = head;
        Node last = null;


        int carry = 1;
        int sum;

        while (curr != null) {
          
       
            sum = carry + curr.data;

            carry = (sum >= 10) ? 1 : 0;

         
            curr.data = sum % 10;

       
            last = curr;
            curr = curr.next;
        }

        if (carry > 0) {
            last.next = new Node(carry);
        }

        return res;
    }


    static Node addOne(Node head) {
 
        head = reverse(head);


        head = addOneUtil(head);

        return reverse(head);
    }

    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

       
        Node head = new Node(1);
        head.next = new Node(9);
        head.next.next = new Node(9);
        head.next.next.next = new Node(8);

        head = addOne(head);

        printList(head);
    }
}