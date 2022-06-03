public class SearchLL {

    // Printing LL
    public static void printList(Node head){
        while (head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    // Searching Element
//    public static int search(Node head, int element){
//        Node currentHead = head;
//        int position =0;
//        while(currentHead != null){
//            position++;
//            if(currentHead.data == element){
//                return position;
//            }
//            else{
//                currentHead = currentHead.next;
//            }
//        }
//        return -1;
//    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        printList(head);
        System.out.println();
        System.out.println("-----------------------");
//        System.out.println("Searching element position "+search(head,20));
//        int pos = search(head,50);
//        if(pos == -1){
//            System.out.println("Element is not found");
//        }else{
//            System.out.println("Postion is : "+pos);
//        }

    }
}
