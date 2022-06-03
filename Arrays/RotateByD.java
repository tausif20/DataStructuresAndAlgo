import java.util.Scanner;

public class RotateByD {

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

    public static void leftArray(int[] arr, int d){
        int[] temp = new int[d];
        for(int i=0; i<d; i++){
            temp[i] = arr[i];
        }
        for(int i = d; i<arr.length; i++){
            arr[i-d] = arr[i];
        }
        for(int i = 0; i<d; i++ ){
            arr[arr.length-d+i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        display(arr);
        leftArray(arr,2);
        System.out.println("After left rotating array element by 2");
        display(arr);

    }
}
