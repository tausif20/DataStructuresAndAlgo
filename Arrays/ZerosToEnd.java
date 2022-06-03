import java.util.Scanner;

public class ZerosToEnd {

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

    public static void moveZero(int arr[]){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                for(int j= i+1; i<arr.length; i++){
                    if(arr[i] != arr[j]){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        display(arr);
        moveZero(arr);
        display(arr);
    }
}
