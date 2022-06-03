import java.util.Scanner;

public class Reverse {

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

    public static void reverseArray(int[] arr){
        int start=0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        display(arr);
        reverseArray(arr);
        display(arr);

    }
}
