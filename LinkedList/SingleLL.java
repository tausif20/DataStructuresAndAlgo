public class SingleLL {

    public static void printList(Node head){
        while(head != null){
            System.out.print(head.data+"->");
            head = head.next;
        }
        System.out.println(head);
    }
    // Recursive Function.
    public static void recursivePrint(Node head){
        if(head == null){
            return;
        }
        System.out.print(head.data+"->");
        recursivePrint(head.next);
    }

    public static void main(String[] args) {
      Node head = new Node(1); // HEAD NODE
      head.next = new Node(2);
      head.next.next = new Node(3);
      head.next.next.next = new Node(4);
      System.out.println(head);
      printList(head); // null
      System.out.println(head);
      //head.next.next.next.next = new Node(5);
      printList(head);
  }
}

