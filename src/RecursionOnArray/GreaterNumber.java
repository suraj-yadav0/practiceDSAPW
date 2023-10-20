package RecursionOnArray;

public class GreaterNumber {
    public static void main(String[] args) {
        int arr[] = { 78  , 5 , 20, 2 , 50};
        System.out.println(gr8(arr,0));

    }
    static int gr8(int[] arr, int idx){
        if (idx == arr.length-1){
            return arr[idx];
        }
      int smallans = gr8(arr,idx+1);
       return Math.max(arr[idx], smallans);


    }
}
