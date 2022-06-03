/*-----------------------------Question 2 :- LINKED LIST OPERATION.------------------------  */
public class LinkedList {
    // Inserting element at the beginning of Linked List
    public static Node insertBegin(Node head, int element){
        Node newNode = new Node(element);
        newNode.next = head;
        return newNode;
    }
    // Deleting the last element of Linked List.
    public static Node deleteNodeAtEnd(Node head){
        if(head == null){
            return null;
        }
        if(head.next == null){
            return null;
        }
        Node currentHead = head;
        while(currentHead.next.next != null){
            currentHead = currentHead.next;
        }
        currentHead.next = null;
        return head;
    }
    // Iterative Method for Traversal.
    public static void traversal(Node head){
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }
    // Recursive Method for Traversal
    public static void recursiveTraversal(Node head){
        if(head == null){
            return;
        }
        System.out.print(head.data+"->");
        recursiveTraversal(head.next);
    }
    // Main Method.
    public static void main(String[] args) {
        Node head = new Node(1); // HEAD NODE
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        System.out.println("Linked List Element : ");
        traversal(head);
        System.out.println("Inserting 10 at the beginning of Linked List :");
        head = insertBegin(head,10);
        traversal(head);
        System.out.println("Deleting the last element form linked List");
        deleteNodeAtEnd(head);
        traversal(head);
    }
}
