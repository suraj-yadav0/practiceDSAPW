package ProblemOnSorting2;

public class Questio3 {
    //sort in ascending order the zeroes , ones and twos

    static void swap(int [] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void sort(int[] arr){
        int low = 0, mid = 0, high = arr.length -1;

        while (mid <= high){
            if (arr[mid] == 0) {
                swap(arr,mid,low);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            }else {
                swap(arr,mid,high);
                high--;
            }
        }

        for (int i:
                arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int [] a = {2,2,0,0,1,1,0,1,2,0};
        sort(a);


    }
}
