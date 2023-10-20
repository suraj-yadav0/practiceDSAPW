package College_Java.firstday;

import java.util.Scanner;

public class Question3 {
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;

    }

    static void print (int arr[] , int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
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

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                swap(arr[i] , arr[n--]);
            }
        }

        print(arr,n);
    }
}
