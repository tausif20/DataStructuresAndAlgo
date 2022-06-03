public class Sort01 {
    public static void main(String[] args) {
        int[] arr = {0,1,0,0,1,1,0,1};

        int zeroIndex=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1){
                int temp = arr[zeroIndex];
                arr[zeroIndex] = arr[i];
                arr[i] = temp;
                zeroIndex++;
            }
        }
        /*
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        */
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
