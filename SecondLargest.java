import java.util.*;
public class SecondLargest {

    public static int[] takeInput(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" elements :");
        for(int i=0; i<n; i++){
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static void display(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    // Finding second largest element
    public static int secondLarge(int[] arr){
        int largest=0;
        int secondlarge = -1;
        for(int i=1; i<arr.length; i++){
            if(arr[i]> arr[largest]){
                secondlarge = largest;
                largest = i;
            }
            else if(secondlarge == -1 || arr[i]>arr[secondlarge]){
                secondlarge = i;
            }
        }

        return secondlarge;
    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        display(arr);
        System.out.println("Second largest element index : "+secondLarge(arr));
    }
}
