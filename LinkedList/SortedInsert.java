//public class SortedInsert {
//    // PRINTING LIST
//    public static void printList(Node head){
//        Node currentHead = head;
//        while(currentHead != null){
//            System.out.print(currentHead.data+" ");
//            currentHead = currentHead.next;
//        }
//    }
//    // INSERTING ELEMENT AT SORTED POSITION
//    public static Node sortedInsert(Node head, int data){
//        Node newNode = new Node(data);
//        if(head == null){
//            return newNode;
//        }
//        if(data < head.data){
//            newNode.next = head;
//            return newNode;
//        }
//        Node currentHead = head;
//        while(currentHead.next != null && currentHead.next.data< data){
//            currentHead = currentHead.next;
//        }
//        newNode.next = currentHead.next;
//        currentHead.next = newNode;
//        return head;
//    }
//
//    public static void main(String[] args) {
//        Node head = new Node(10);
//        head.next = new Node(20);
//        head.next.next = new Node(30);
//        head.next.next.next = new Node(40);
//        printList(head);
//        System.out.println();
//        head = sortedInsert(head, 25);
//        printList(head);
//    }
//}
