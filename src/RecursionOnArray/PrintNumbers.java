package RecursionOnArray;

public class PrintNumbers {
    public static void main(String[] args) {
        int arr[] = {5,6,7,8};
        printarray(arr,0);

    }
    static void printarray(int[] arr,int idx){
        if (idx == arr.length){
            return ;
        }
        System.out.print(arr[idx]);
        printarray(arr,idx+1);
    }
}
