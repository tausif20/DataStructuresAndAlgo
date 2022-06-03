import javax.swing.*;

public class MyStack {
    private int[] array; // because we are performing stack with array.
    private int top; // used for index
    private int capacity; // used for stack capacity

    // Constructor to construct the stack.
    MyStack(int size){
        capacity = size; // Size of stack
        array = new int[capacity];
        top = -1;  // -1 because to check array is empty or other way to start index from 0
    }

    // To check the stack is empty or not
    public boolean isEmpty()
    {
        return  (top == -1); // if index is -1 then stack is empty i.e.  true
    }

    // To Find the size of stack means how many elements are in the stack
    public int size()
    {
        return top++;
    }
    // For inserting or adding the element
    public void push(int element){
//        if(top == capacity - 1){
//            System.out.println("We can't insert ......Stack is full.");
//            return;
//        }
        if(top<capacity){
            array[++top] = element;
        }
        else{
            System.out.println("We can't insert ......Stack is full.");
            return;
        }


    }
    // For pop operation i.e. removing element form top

    public int pop(){
        if(top == -1){
            System.out.println("Stack is empty.......");
            return Integer.MIN_VALUE;
        }
        int temp = array[top];
        top--;
        return temp;
    }

    // for know the top element of the stack
    public int peek(){
        return array[top];
    }

    // To print the Stack
    public void printStack(){
        for(int i=0; i<=top; i++){
            System.out.print(array[i]+" ");
        }
    }
    //Driver class
    public static void main(String[] args) {
        MyStack s = new MyStack(10); // 10 size of stack.
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.push(60);
        s.printStack();
        s.pop();
       System.out.println("\nAfter Removing element from stack");
        s.printStack();
        System.out.println("\n"+s.peek());
    }
}
