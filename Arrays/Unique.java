public class Unique {
    public static void main(String[] args) {
        int[] arr = {2,3,1,6,3,6,2};

        int ans=0;
        for(int i=0; i<arr.length; i++){
            ans = arr[i]^ans;
        }
        System.out.println(ans);
        /*
        int count=0;
        for(int i=0; i<arr.length; i++){
            int j;
            for(j=0; j<arr.length; j++){
                if(i!=j){
                    if(arr[i] == arr[j]){
                        break;
                    }
                }
            }
            if(j==arr.length){
                System.out.println(arr[i]);
                break;
            }
        }
        */
    }
}
