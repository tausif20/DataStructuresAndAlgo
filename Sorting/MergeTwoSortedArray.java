import java.util.*;
public class MergeTwoSortedArray {

    /*
    // Navie approach
    public static  void merge(int[] a, int[] b){
        int[] c = new int[a.length + b.length];
        for(int i=0; i<a.length; i++){
            c[i] = a[i];
        }
        for(int j=0; j<b.length; j++){
            c[a.length+j] = b[j];
        }
        Arrays.sort(c);
        for(int i=0; i<c.length; i++){
            System.out.print(c[i]+" ");
        }
    }
    */
    // Efficient solution.
    public static  void merge(int[] a, int[] b){
        int i=0, j=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                System.out.print(a[i]+" ");
                i++;
            }
            else{
                System.out.print(b[j]+" ");
                j++;
            }
        }
        while(i<a.length){
            System.out.print(a[i]+" ");
            i++;
        }
        while (j<b.length){
            System.out.print(b[j]+" ");
            j++;
        }
    }

    public static void main(String[] args) {
        int a[] = {10,20,35,40};
        int b[] = {5,50,50};
        merge(a,b);
    }
}
