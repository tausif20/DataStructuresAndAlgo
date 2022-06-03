public class BubbleSort {

    public static void bubble(int[] array){
        /*
        for(int i=0; i<array.length-1; i++){
            for(int j=0; j<array.length-i-1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        */
        // Efficient solution if array become sorted at middle.
        for(int i=0; i<array.length-1; i++){
            boolean swaped = false;
            for(int j=0; j<array.length-i-1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swaped = true;
                }
            }
            if(swaped == false){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {2,10,8,7,58};
        bubble(array);
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
}
