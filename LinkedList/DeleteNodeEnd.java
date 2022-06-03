public class DeleteNodeEnd {
    // PRINTING LIST
    public static void printList(Node head){
        Node currentHead = head;
        while (currentHead != null){
            System.out.print(currentHead.data+" ");
            currentHead = currentHead.next;
        }
    }
    // DELETE NODE AT THE END.
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

    public static void main(String[] args) {
        Node head = new Node(100);
        head.next = new Node(200);
        head.next.next = new Node(300);
        printList(head);
        System.out.println("\n----------------------");
        head = deleteNodeAtEnd(head);
        printList(head);
    }
}
