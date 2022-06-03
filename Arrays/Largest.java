import java.util.Scanner;

public class Largest {
    // Taking Input
    public  static int[] takeInput(){
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter the array size");
        int size = sc.nextInt();
        int[] array = new int[size];
        //System.out.println(array.length);
        System.out.println("Enter the "+ size + " element");
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
    // Finding largest
   public  static  int largest(int[] arr){
        int largest =0;
        for(int i=1; i<arr.length; i++){
            if(arr[i]>arr[largest]){
                largest = i;
            }
        }
        return  largest;
   }
    public static void main(String[] args) {
        int [] arr = takeInput();
        printArray(arr);
        System.out.println("\n largest element of an array index is : "+largest(arr));
    }
}
