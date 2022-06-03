public class InsertionSort {
    public static void insertionSort(int[] array){
        for(int i= 1 ; i<array.length; i++){
            int element_to_be_inserted = array[i];
            int j=i-1;
            while(j>=0 && array[j]> element_to_be_inserted){
                array[j+1] = array[j];
                j--;
            }
            array[j+1]= element_to_be_inserted;
        }
    }
    public static void main(String[] args) {
        int[] array = {10,5,1,8,9,4,2};
        insertionSort(array);
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }

}
