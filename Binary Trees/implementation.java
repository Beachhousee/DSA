public class implementation {
    public static class Node {
        int val;
        Node left;
        Node right;

        // Constructor
        Node(int val) {
            this.val = val;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10); // ✅ just pass value
        System.out.println(root.val);
    }
}
 