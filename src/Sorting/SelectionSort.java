package Sorting;

import java.util.Scanner;

public class SelectionSort {
    static void selectionSort(int arr[]){
        for (int i = 0; i < arr.length -1 ; i++) {
            int index = i;
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[j]  <  arr[index]){
                    index = j;
                }
                int temp = arr[i];
                arr[i] = arr [index];
                arr[index] = temp;
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

        selectionSort(arr);
        for (int i:
             arr) {
            System.out.print(i +  " ");
        }

    }
}
