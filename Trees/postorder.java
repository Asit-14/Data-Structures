package Trees;

public class postorder {
    
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        postorderTraversal(root);
    }

    public static void postorderTraversal(Node root){
        if(root == null){
            return;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.println(root.data);
    }
    
}

class Node {
    int data;
    Node left, right;

    public Node(int item){
        data = item;
        left = right = null;
    }
}