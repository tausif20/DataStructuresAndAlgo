public class ArrangeNumbers {
    public static void main(String[] args) {
        int N = 6;
        int[] arr = new int[N];
        int start =0;
        int end = arr.length-1;
        int Number = 1;

        while(start<=end){
            if(Number %2 !=0){
                arr[start] = Number;
                Number++;
                start++;
            }
            else{
                arr[end] = Number;
                end--;
                Number++;
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
