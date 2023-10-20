package Sorting;

import java.util.Scanner;

public class InsertionSort {
    static void insertionSort (int arr[]){
        for (int i = 1; i < arr.length ; i++) {
            int j = i;
            while (j>0 && arr[j]  < arr[j-1]){
                //swap
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;

                j--;
            }

        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of the Array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the Array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        insertionSort(arr);
        for (int i:
             arr) {
            System.out.print(i + " ");
        }
    }
}
