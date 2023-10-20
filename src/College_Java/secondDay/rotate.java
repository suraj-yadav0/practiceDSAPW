package College_Java.secondDay;

import java.util.Scanner;

public class rotate {
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
        System.out.println("Enter number of AnticlockWise Rotations : ");
        int x = sc.nextInt();

        int temp = arr[x-1];

        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;

        for (int i:
                arr ) {
            System.out.print(i + " ");
        }
    }
}
