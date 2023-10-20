package College_Java.FourthDay;

import java.util.Scanner;

public class question1 {

    static void sort (int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j>0 && arr[j] < arr[j-1]) {
                int temp  = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;

                j--;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter no. of elements of the Array:");
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sort(arr);

        System.out.print("Required Result : ");
int x = arr.length/2;
        if (arr.length % 2 == 0) {
            for (int i = 0; i < arr.length/2; i++) {
                System.out.print(arr[i] + " ");
                System.out.print(arr[x++] + " ");
            }
        }
        else {
            for (int i = 0; i < arr.length/2; i++) {
                System.out.print(arr[i] + " ");
                System.out.print(arr[x++] + " ");
            }
            System.out.print(arr[arr.length-1]+ " ");
        }


    }
}
