public class Deletion {
    public static int delete(int arr[], int deleteNumber){
        int i=0;
        for (i=0; i<arr.length; i++){
            if(arr[i] == deleteNumber)
                break;
        }
        if(i== arr.length){
            return arr.length;
        }
        for(int j = i; j<arr.length-1; j++){
            arr[j] = arr[j+1];
        }
        return (arr.length-1);
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int length = delete(arr,20);
        for(int i =0; i<length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
