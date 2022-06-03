public class InsertEnd {
    // Printing list
    public static void printList(Node head){
        // Node currentHead = head;
        while (head != null){
            System.out.print(head.data+" ");
            head =  head.next;
        }
    }
    // Inserting element at the end
    public static Node insertEnd(Node head, int element){
        Node newNode = new Node(element);
        if(head == null){
            return newNode;
        }
        //Node currentHead = head;
        while(head.next != null){
            head =head.next;
        }
        head.next = newNode;
        return head;
    }




    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(4);
        head.next.next = new Node(6);
        printList(head);
        System.out.println("\n----------------");
        head = insertEnd(head , 8);
        printList(head);
    }
}
