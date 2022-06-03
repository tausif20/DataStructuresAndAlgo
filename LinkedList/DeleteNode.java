// Delete Node from first position.
public class DeleteNode {

    public static void printList(Node head){
        Node currentHead = head;
        while(currentHead != null){
            System.out.print(currentHead.data+" ");
            currentHead = currentHead.next;
        }
        System.out.println();
    }
    // Delete element from first postion
    public static Node deleteNode(Node head){
        if(head == null){
            return null;
        }
        else{
            return head.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(11);
        head.next = new Node(22);
        head.next.next = new Node(33);
        printList(head);
        System.out.println("\n---------------------");
        head = deleteNode(head);
        printList(head);
    }
}
