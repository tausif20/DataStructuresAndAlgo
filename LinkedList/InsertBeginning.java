public class InsertBeginning {
    // Printing List
    public static void printList(Node head){
        Node currentHead = head;
        while(currentHead != null){
            System.out.print(head.data+" ");
            currentHead = currentHead.next;
        }
        System.out.println();
    }

    //Insert at beginning
    public static Node insertBegin(Node head, int element){
        Node newNode = new Node(element);
        newNode.next = head;
        return newNode;
    }

    public static void main(String[] args) {
        Node head = new Node(100);
        head.next = new Node(200);
        head.next.next = new Node(300);
        printList(head);

        // Adding Element at the beginning
        head = insertBegin(head,1);
        printList(head);

        System.out.println("------------------------------------------------");

        Node newHead = null;
        newHead = insertBegin(newHead, 1000);
        printList(newHead);
    }
}
