package searching;

public class recursiveBinarySearch {

    static boolean search(int[] arr,int start, int end , int target) {
        if (start > end) {
            return false;
        }
        int mid = (start + end)/2;
        if (target == arr[mid]) {
            return true;
        } else if (target < arr[mid]) {
          return   search(arr,start,mid-1,target);
        }else {
          return   search(arr,mid+1,end,target);
        }

    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,7,9,11,13};
        int target  = 7;
        System.out.println(search(arr,0,arr.length-1,target));
    }
}
