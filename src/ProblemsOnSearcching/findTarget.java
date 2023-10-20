package ProblemsOnSearcching;

public class findTarget {

    static int search(int [] arr, int target) {
        int st = 0, end = arr.length -1;
        while (st <= end) {
            int mid = (st+  end)/2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] <arr[end]) {
                if (target > arr[mid] && target <= arr[end]) {
                    st = mid +1;
                }else {
                    end = mid -1;
                }
            }else {
                if (target >= arr[st] && target < arr[mid]) {
                    end = mid -1;
                }else {
                    st = mid +1;
                }
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {5,6,7,8,9,1,2,3,4};
        System.out.println(search(arr,6));

    }
}
