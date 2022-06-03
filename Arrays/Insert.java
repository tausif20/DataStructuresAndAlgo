import com.sun.source.tree.BreakTree;

import java.util.Scanner;

    public class Insert {


    public  static int[] takeInput(){
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter the array size");
        int size = sc.nextInt();
        int[] array = new int[size];
        //System.out.println(array.length);
        int n = 5;
        System.out.println("Enter the "+ n+" element");
        for(int i=0; i<n; i++)
        {
            array[i] = sc.nextInt();
        }
        return  array;
    }


    public static int insert(int arr[], int length, int capacity,int element, int position){
        if(length == capacity){
            return length;
        }
        for(int i = length-1; i>=position-1; i--){
            arr[i+1] = arr[i];
        }
        arr[position-1] = element;
        return (length+1);
    }

        // Printing array
        public static void printArray(int[] array){
            for(int e : array){
                System.out.print(e+" ");
            }
        }

    public static void main(String[] args) {
        int [] arr = takeInput();
        printArray(arr);
        System.out.println(arr.length);
        int length = insert(arr, 5, arr.length, 25,2);
        for(int e : arr){
            System.out.print(e+" ");
        }
    }
}
