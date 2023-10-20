package searching;

public class FirstOcuurance {


    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;
        int FO = -1;
        while (start <= end) {
            int mid  = start +  (end -start)/2;
            if (arr[mid] == target) {
                FO = mid;
                end = mid -1;
            } else if (target < arr[mid]) {
                end = mid -1;
            }else {
                start = mid +1;
            }
        }
        return FO;
    }
    public static void main(String[] args) {
        int [] arr = {2,5,5,5,6,6,8,9,9,9};
        int x = 5;
        System.out.println(search(arr,x));

    }
}
