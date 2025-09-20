public class preInPost {
  public static void pip(int n) {
    if (n == 0)
      return;
    System.out.println("Pre" + n);
    pip(n - 1);
    System.out.println("In" + n);
    pip(n - 1);
    System.out.println("Post" + n);
  }

  public static class Node {
    int val;
    Node left;
    Node right;

    public Node(int val) {
      this.val = val;

    }}
public static void preorder(Node root) {
    //preorder is root then left then right 
    if(root==null) return;
    System.out.print(root.val+ " ");
    preorder(root.left);
    preorder(root.right);
}
public static void Inorder(Node root) {

    if(root==null) return;
     Inorder(root.left);
    System.out.print(root.val+ " ");
    Inorder(root.right);
}
public static void postorder(Node root) {
    //preorder is root then left then right 
    if(root==null) return;
    postorder(root.left);
    postorder(root.right);
     System.out.print(root.val+ " ");
}
    public static void main(String[] args) {
      Node root = new Node(1);
      Node a = new Node(2);
      Node b = new Node(3);
      root.left = a;
      root.right = b;
      Node c = new Node(4);
      Node d = new Node(5);
      a.left = c;
      a.right = d;
      Node e = new Node(6);
      Node f = new Node(7);
      b.left = e;
      b.right = f;
      preorder(root);
        Inorder(root);
        postorder(root);
    }
  }