package ProblemOnSorting2;


// sort in linear time ans seggregate them according to positive and negative
public class Question2 {

    static void swap(int [] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void sort(int[] arr){
//        int pivot = 0;
        int i = 0;
        int j = arr.length-1;

   while (i < j) {
       while (arr[i] < 0) i++;
       while (arr[j] > 0) j--;
       if (arr[i] > 0 && arr[j] < 0) {
           swap(arr,i,j);
           i++;
           j--;
       }
   }
    }


    public static void main(String[] args) {
        int [] arr = {19,-20,7,-4,-13,11,-5,3};
        sort(arr);
        for (int i:
             arr) {
            System.out.print(i + " ");
        }
    }
}
