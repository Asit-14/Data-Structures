package Trees;

public class preorder {

    public static void main(String[] args) {
        Node root = new Node(1);
        Node.left = new Node (2);
        Node.right = new Node (3);
        Node.left.left  =  new Node (4);
        Node right.right = new  Node (45);
        preorderTraversal(root);


    }
    
}