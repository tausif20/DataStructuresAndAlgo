public class DoublyLinkedList {
    // Deleting last node from doubly linked list
    static DoublyNode delLast(DoublyNode head){
        if(head==null){
            return null;
        }
        if(head.next==null){
            return null;
        }
        DoublyNode curr=head;
        while(curr.next!=null)
            curr=curr.next;
        curr.prev.next=null;
        return head;
    }
    // Inserting element at the beginning of Doubly linked list
    static DoublyNode insertBegin(DoublyNode head, int data){
        DoublyNode temp=new DoublyNode(data);
        temp.next=head;
        if(head!=null)head.prev=temp;
        return temp;
    }
    // Traversal of Doubly Linked List
    public static void traversal(DoublyNode head){
        DoublyNode curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }
    // Main Method.
    public static void main(String[] args) {
        DoublyNode head=new DoublyNode(10);
        DoublyNode temp1=new DoublyNode(20);
        DoublyNode temp2=new DoublyNode(30);
        head.next=temp1;
        temp1.prev=head;
        temp1.next=temp2;
        temp2.prev=temp1;
        System.out.println("Doubly Linked List Elements are :");
        traversal(head);
        System.out.println("Inserting 100 at the beginning of doubly linked list");
        head = insertBegin(head,100);
        traversal(head);
        System.out.println("Deleting last element from doubly linked list");
        head = delLast(head);
        traversal(head);
    }
}
