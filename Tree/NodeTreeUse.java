import java.util.*;
public class NodeTreeUse {

    public static Node createNode(){
        Scanner sc = new Scanner(System.in);
        Node root = null;
        System.out.println("Enter Data ");
        int data = sc.nextInt();
        if(data == -1){
            return null;
        }
        root = new Node(data);

        System.out.println("Enter left for "+data);
        root.left = createNode();

        System.out.println("Enter Right for "+data);
        root.right = createNode();

        return root;
    }

    // Inorder Traversal ----> Recursively
    // Time Complexity = O(n) =====> Auxiliary Space =
    public static void inorderTraversal(Node root){
        if(root != null){
            inorderTraversal((root.left));
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
    }
    // Preorder Traversal
    // Time Complexity = O(n) =====> Auxiliary Space =
    public static void preorderTraversal(Node root){
        if(root != null){
            System.out.print(root.data + " ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }
    //Postorder Traversal
    public static void postorderTraversal(Node root){
        if(root != null){
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.print(root.data+" ");
        }
    }

    // Height of binary tree
    public static void heightOfBinaryTree(Node root){

    }

    public static void printTree(Node root){
        while(root!=null){
            System.out.print(root.data+" ");
            root = root.left;
        }
    }

    public static void main(String[] args) {
        Node root             = new Node(10);
        root.left             = new Node(20);
        root.right            = new Node(30);
        root.left.left        = new Node(40);
        root.left.right       = new Node(50);
        root.right.right      = new Node(60);
        root.left.right.left  = new Node(70);
        root.left.right.right = new Node(80);

        printTree(root);

//        Node root = createNode();
//        // Inorder Traversal --->  Left-Root-Right
//        inorderTraversal(root);
//        System.out.println();
//        // Preorder Traversal ---> Root-Left-Right
//        preorderTraversal(root);
//        System.out.println();
//        // Postorder Traversal ---> Left-Right-Root
//        postorderTraversal(root);
    }
}
