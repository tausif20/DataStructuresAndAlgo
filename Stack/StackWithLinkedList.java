class StackNode{
    int data;
    StackNode  next;
    StackNode(int data){
        this.data = data;
        next = null;
    }
}

class MystackLL{
    StackNode head;
    int size;

    MystackLL(){
        head = null;
        size = 0;
    }

    int size(){
        return size;
    }

    boolean isEmpty(){
        return (head == null);
    }

    void push(int x){
        StackNode newNode = new StackNode(x);
        newNode.next = head;
        head  = newNode;
        size++;
    }

    int pop(){
        if(head == null){
            return Integer.MAX_VALUE;
        }
        int temp = head.data;
       head = head.next;
       size--;
       return temp;

    }

    int peek(){
        if(head == null){
            return Integer.MAX_VALUE;
        }
        return head.data;
    }

    void  printStack(){
        StackNode curr = head;
        while(curr != null){
            System.out.print(curr.data +" ");
            curr = curr.next;
        }
    }

}




public class StackWithLinkedList {
    public static void main(String[] args) {
        MystackLL s = new MystackLL();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(1000);

        s.printStack();
        System.out.println();
        System.out.println(s.peek());
    }
}
