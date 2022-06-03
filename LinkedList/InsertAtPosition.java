public class InsertAtPosition {
    //PRINT LIST
    public static void printList(Node head){
        Node currentHead = head;
        while(currentHead != null){
            System.out.print(currentHead.data+" ");
            currentHead = currentHead.next;
        }
    }
    // Inserting at given position
    public static Node insertAtPosition(Node head, int position, int data){
        Node newNode = new Node(data);
        if(position<=0){
            return head;
        }
        if(position == 1){
            newNode.next = head;
            return newNode;
        }
        Node currentHead = head;
        /*
        for(int i=1; (i<=position-2 && currentHead!=null); i++){
            currentHead = currentHead.next;
        }
        */
        for(int i=1; (i<=position-2); i++){
            currentHead = currentHead.next;
        }
        if(currentHead == null){
            return  head;
        }
        newNode.next = currentHead.next;
        currentHead.next = newNode;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        printList(head);
        System.out.println();
        head = insertAtPosition(head,10,100);
        printList(head);
    }
}
