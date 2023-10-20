package ProblemOnSorting2;

public class Question1 {
// sort in linear time when only two are not at right position
    static void sort(int[] arr) {
        int n = arr.length;
        if (n <= 1){//corner case
            return;
        }

        int x = -1;
        int y = -1;
        for (int i = 1; i < n; i++) {
            if (arr[i-1] > arr[i]) {
                if (x==-1){
                    x = i-1;
                    y = i;
                }else {
                    y = i;
                }
            }
        }

        int temp = arr[x];
        arr[x]  = arr[y];
        arr[y] = temp;
    }
    public static void main(String[] args) {
        int [] arr = {10,5,6,7,8,9,3};

        sort(arr);
        for (int i:
            arr ) {
            System.out.print(i + " ");
        }

    }
}
