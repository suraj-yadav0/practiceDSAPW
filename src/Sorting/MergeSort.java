package Sorting;

import java.util.Scanner;

public class MergeSort {

    static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid -left +  1;
        int n2 = right-mid;
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        int i, j, k;
        for (i = 0; i < n1; i++) {
            arr1[i] = arr[left + i];
        }

        for (j = 0; j < n2; j++) {
            arr2[j] = arr[mid + 1 + j];
        }
        i = 0;
        j = 0;
        k = left;
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                arr[k++] = arr1[i++];
            } else {
                arr[k++] = arr2[j++];
            }
        }
        while (i < n1) {
            arr[k++] = arr1[i++];
        }
        while (j<n2) {
            arr[k++] = arr2[j++];
        }


    }

    static void sort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        sort(arr, left, mid);
        sort(arr, mid + 1, right);
        merge(arr,left,mid,right);

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
        System.out.println();

        sort(arr, 0, arr.length-1);

        System.out.println("Array after Sorting:");

        for (int i:
            arr ) {
            System.out.print(i + "  ");
        }

    }
}
