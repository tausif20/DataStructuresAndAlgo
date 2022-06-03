class St
{
    int data;
    int top=-1;
    int arr[];
    int size;

    public St(int size)
    {
        this.size=size;

        arr = new int[size];
    }

    boolean isFull()
    {
        return top == size-1;
    }

    boolean isEmpty()
    {
        return top == -1;
    }

    void push(int X)
    {
//        if(isFull())
//        {
//            System.out.println("Stack is full");
//            return -1;
//        }
//        else
//        {
//
//        }
//        return 0;

        if(top<size){
            top=top+1;
          arr[top]=X;
        }
        else
        {
            System.out.println("Stack is full");
           return;

        }

    }

    int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
        }
        return arr[top--];
    }

    public void printStack()
    {
        for(int i=0; i<=top; i++)
        {
            System.out.println(arr[i]+" ");
        }
    }

}

public class Stack
{
    public static void main(String[] args)
    {
        St s1 = new St(5);
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);

        s1.printStack();
        System.out.println("\n"+s1.pop());
//
//        System.out.println("\n"+s1.pop());
//        s1.pop();
//        s1.pop();
//        s1.pop();
//        s1.pop();
//
//
//        System.out.println("AFter pop function");
//        s1.printStack();

    }

}