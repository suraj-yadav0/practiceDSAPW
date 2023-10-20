package ProblemsOnSorting;

import java.util.Scanner;

public class Question1 {

    static void sort(int arr[]){
        for (int i = 0; i < arr.length ; i++) {
boolean flag = false;
            for (int j = 0; j < arr.length -i-1 ; j++) {
                if (arr[j] == 0 && arr[j+1] != 0) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
if (!flag){
    return;
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

        sort(arr);
        for (int i:
             arr) {
            System.out.print(i + " ");
        }
    }
}
