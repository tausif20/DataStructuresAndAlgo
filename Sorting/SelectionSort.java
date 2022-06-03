/*-------------------------------Question 1:- SELECTION SORT-----------------------------*/
public class SelectionSort {
    // Selection Sort Method :
    public static void selectionSort(int[] array){
        // Traversing the Array.
        for(int i=0; i<array.length; i++){
            // Finding the index of the smallest element to move the smallest elemnt on its final position.
            int smallest_element_index = i;
            for(int j= i+1; j<array.length; j++){
                if(array[j] < array[smallest_element_index]){
                    smallest_element_index = j;
                }
            }
            // Swapping the smallest element to its final position.
            int temp = array[smallest_element_index];
            array[smallest_element_index] = array[i];
            array[i] = temp;
        }
    }
    //Method to print Array Elements.
    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    // Main function.
    public static void main(String[] args) {
        int[] array  = {67,12,45,35,89,26,51,7,93};
        System.out.println("Array Before Sorting : ");
        printArray(array);
        selectionSort(array); // Calling the selectionSort method to perform operations.
        System.out.println("\nArray After Sorting :");
        printArray(array);
    }
}
