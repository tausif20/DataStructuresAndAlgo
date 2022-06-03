public class NodeUsing {

    public static void printList(Node head){
        Node current = head;
        while(current != null){
            System.out.print(current.data+"->");
            current = current.next;
        }
    }
    // INSERTION AT BEGINNING
    public static Node insertBegin(Node head, int x){
        Node newNode = new Node(x);
        newNode.next = head;
        return newNode;
    }

    // INSERTION AT END
    public static Node insertEnd(Node head, int x){
        Node newNode = new Node(x);
        if(head == null){
            return newNode;
        }
        Node currentHead = head;
        while (currentHead.next != null){
            currentHead = currentHead.next;
        }
        currentHead.next = newNode;
        return head;
    }

    // INSERTION AT POSITION
    public static Node insertPos(Node head, int position, int x){
        Node newNode = new Node(x);
        if(position == 1){
            newNode.next = head;
            return newNode;
        }
        Node currentHead = head;
        for(int i=1; (i<=position-2 && currentHead!=null); i++){
            currentHead = currentHead.next;
        }
        if(currentHead == null){
            return head;
        }
        newNode.next = currentHead.next;
        currentHead.next = newNode;
        return head;
    }


    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        printList(head);
        System.out.println();
        // Inserting at the begin.
        head = insertBegin(head,125);
        printList(head);
        System.out.println();
        //Inserting at end.
        head = insertEnd(head,200);
        printList(head);
        System.out.println();
        // Inserting at position
        head = insertPos(head,1,500);
        printList(head);

    }
}



 /*
        Node head = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        head.next = node2;
        node2.next = node3;

        System.out.println(head.data + " "+node2.data + " "+ node3.data);
 */