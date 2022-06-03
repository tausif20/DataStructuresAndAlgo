import java.util.Scanner;

public class IsSorted {

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

    public static  boolean isSorted(int[] array){
        for(int i =1; i<array.length; i++){
            if(array[i-1]>array[i]){
                return  false;
            }
        }
        return  true;
    }

    public static void main(String[] args) {
        int [] arr = takeInput();
        printArray(arr);
        System.out.println("is Array sorted : "+isSorted(arr));
    }
}
