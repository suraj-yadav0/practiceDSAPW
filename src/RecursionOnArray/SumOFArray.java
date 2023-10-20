package RecursionOnArray;

public class SumOFArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,45,55,70};
        System.out.println("Sum of Array:" + sumArray(arr,0));
    }
    static int sumArray(int[] arr, int idx){
        if (idx == arr.length-1){
            return arr[idx];
        }
        if (idx == arr.length){
            return 0;
        }
        int sum = sumArray(arr,idx+1);
        return arr[idx] + sum;
    }
}
