public class LinkedListTest {
    Node head;   // Creating Reference
    static class Node   // creating class for to create New_Node
    {
        int data;     //data variable of created node
        Node next;    //next is reference which stores the address of next link
        Node(int d)   //Parameterized Constructor to use initialize data&next
        {
            data=d;
            next=null;
        }
    }
    public void display()
    {
        //Node trav=head;
        while(head!=null)
        //while(trav!=null)
        {
            System.out.print(head.data+"-->");
            head=head.next;
        }
        System.out.println(head+" Ending Linklist1");
    }
    public static void main(String[] args)  //Main method Program starting point execution
    {
        LinkedListTest Linklist1=new LinkedListTest();  //Created object of LinkedListTest
        Linklist1.head=new Node(11);   //assigning memory to created head reference
        Node n1=new Node(22);          //created 2nd node
        Node n2=new Node(33);          //created 3rd node
        Linklist1.head.next=n1;      //Lin
        n1.next=n2;                  //Linking the 2nd node with 3rd node
        Linklist1.display();
    }
}
