import  java.util.*;
public class Search {

    // Taking Input
    public  static int[] takeInput(){
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter the array size");
        int size = sc.nextInt();
        int[] array = new int[size];
        //System.out.println(array.length);
        System.out.println("Enter the "+ array.length+" element");
        for(int i=0; i<array.length; i++)
        {
            array[i] = sc.nextInt();
        }
        return  array;
    }

    // Printing array
    public static void printArray(int[] array){
        for(int e : array){
            System.out.print(e+" ");
        }
    }

    // Searching array element in array

    public static int linearSearch(int[] arr, int element){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == element){
                return i;
            }
        }
        return  -1;
    }

    public  static  void  main(String[] args){
        Scanner sc = new Scanner((System.in));
        int [] arr = takeInput();
        printArray(arr);
        System.out.println("\nEnter element you want to search ");
        int element = sc.nextInt();
        System.out.println("\nElement found at index "+linearSearch(arr,element));
    }

}
