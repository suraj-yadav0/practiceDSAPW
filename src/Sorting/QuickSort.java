package Sorting;

public class QuickSort {

    static void print (int arr[]) {
        for (int i:
             arr) {
            System.out.print(i + "  ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int a , int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static int partion (int []arr , int start, int end) {
        int pivot = arr[start];
        int count = 0;
        for (int i = start + 1 ; i <= end ; i++) {
            if (arr[i] <= pivot) count++;
        }

        int pivotIdx = start + count;
        swap(arr,start,pivotIdx);
        int i = start, j = end ;

        while (i < pivotIdx && j  > pivotIdx) {
            while (arr[i] <= pivot) i++;
            while (arr[j]  > pivot) j--;
            if (i < pivotIdx && j > pivotIdx) {
                swap(arr,i , j);
                i++;
                j--;
            }
        }

        return pivotIdx;

    }

    static void quickSort(int []arr , int start, int end) {
        if (start >= end) {
            return;
        }
        int pi = partion(arr,start,end);
        quickSort(arr,start,pi-1);
        quickSort(arr,pi+1, end);
    }
    public static void main(String[] args) {
        int arr [] = {7 ,5,4,8,3,2,6};
        System.out.println("Before Sorting : ");
        print(arr);

        quickSort(arr,0,arr.length-1);
        System.out.println("After Sorting :");
        print(arr);

    }
}
