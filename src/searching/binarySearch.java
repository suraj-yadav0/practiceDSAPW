package searching;

public class binarySearch {

    static boolean search(int[] arr, int target) {
     int start = 0;
     int end = arr.length-1;
     while (start<= end){
         int mid = (start + end)/2;
         if (arr[mid] == target) {
             return true;
         }
        else if (target>arr[mid]) {
             start  = mid + 1 ;
         }else {
             end = mid -1;
         }
     }
     return  false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,9,12};
        int target = 5;
        boolean ans = search(arr,target);
        System.out.println(ans);
    }
}
