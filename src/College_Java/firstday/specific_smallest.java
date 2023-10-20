package College_Java.firstday;

import java.util.Arrays;
import java.util.Scanner;

public class specific_smallest {
    public static void main(String[] args) {

        System.out.println("Enter the size of the Array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the Array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i:
                arr ) {
            System.out.print(i + " ");
        }
        System.out.println();
        Arrays.sort(arr);
        System.out.println("Enter the specific position of smallest :");
        int x = sc.nextInt();
        System.out.println(arr[x-1]);
    }
}
