public class CircularUse {

    public static void printList(Node head){
        if(head == null){
            return;
        }
        int count = 0;
        Node curr = head;
        do{
            count++;
            System.out.print(curr.data+" ");
            curr = curr.next;
        }while (curr != head);
        System.out.println(count);

//        System.out.print(head.data+" ");
//        Node curr = head.next;
//        while(curr != head){
//            System.out.print(curr.data+" ");
//            curr = curr.next;
//        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = head;
        printList(head);
    }
}
