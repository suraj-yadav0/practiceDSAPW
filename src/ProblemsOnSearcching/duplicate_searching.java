package ProblemsOnSearcching;

public class duplicate_searching {
    static int search(int arr[], int target) {
        int st = 0;
        int end = arr.length -1 ;
        while (st <= end) {
            int mid = (st + end)/2;
            if (arr[mid] == target) {
                return mid;
            }
          else  if (arr[mid] == arr[st] && arr[mid] == arr[end]) {
                st++;
                end --;
            } else if (arr[mid] <= arr[end]) {
                if (target <= arr[end] && arr[mid] < target) {
                    st = mid +1 ;
                }else {
                    end = mid -1;
                }
            }else {
                if (target >= arr[st] && arr[mid] > target) {
                    end = mid -1;
                }else {
                    st = mid +1 ;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int [] arr = {1, 1, 1, 2, 2, 3, 1};
       int ans =  search(arr,3);
        System.out.println(ans);
    }
}
