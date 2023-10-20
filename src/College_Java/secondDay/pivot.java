package College_Java.secondDay;

import java.util.Scanner;

public class pivot {
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
        System.out.print("Pivot: ");
        for (int i = 1; i < arr.length-1; i++) {
            if (arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
