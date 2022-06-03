class StackImplementation{
    int[] array;   // Stack Array
    int top;  // Stack index
    int  capacity;

    // Stack Creation with capacity.
    StackImplementation(int capacity){
        this. capacity = capacity;
        array = new int[capacity];
        top = -1;
    }

    // Inserting Element into the stack
    void push(int element){
     if(top < capacity){
            top++;
            array[top] = element;
        }
        else{
            System.out.println("Stack is full.....");
        }
    }

    // Removing the element from the stack
    void pop(){
        if(top == -1){
            System.out.println("Stack is empty... You can't pop..........");
            return;
        }
        int temp = array[top];
        top--;
    }

    // Finding the top element of the stack
    int peek(){
        if(top == -1){
            System.out.println("Stack is empty...");
            return Integer.MIN_VALUE;
        }
        return array[top];
    }

    // Checking Stack Is Empty or Not
     boolean isEmpty(){
        if(top == -1){
            return true; // if top == -1 means there is no element in stack means stack is empty.
        }
        return false; // if top != -1 means there is something in stack so stack is not empty.
    }

    // Size of the Stack
    int size(){
        if(top == -1){
            return -1;  // It means our stack is empty.
        }
        else{
            return (top+1);
        }
    }

    // Printing stack
    void printStack(){
        for(int i=0; i<= top; i++){
            System.out.print(array[i]+" ");
        }
    }

}

public class StackWithArray {
    public static void main(String[] args) {
        StackImplementation stack = new StackImplementation(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.printStack();
        System.out.println();
        System.out.println("Stack Size is "+stack.size());
        stack.pop();
        stack.printStack();
        System.out.println();
        System.out.println(stack.isEmpty());

    }
}







/*
        if(top==capacity-1)
        {
            System.out.println("Stack is full");
            return;
        }
        top++;
        array[top]=element;


        if(top < capacity){
            top++;
            array[top] = element;
        }
        else{
            System.out.println("Stack is full.....");
        }
 */
