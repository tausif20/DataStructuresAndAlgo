public class LL {
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    // add - first , last
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    // add-last
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;
    }

    public void printList(){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data+" -> ");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("Tausif");
        list.addFirst("Shaikh");
        list.printList();

        list.addLast("Last");
        list.printList();
    }
}

/*
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




    // Inserting at position
        head = insertPos(head,2,500);
        printList(head);







 */