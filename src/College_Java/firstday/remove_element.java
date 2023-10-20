package College_Java.firstday;

import java.util.Scanner;

public class remove_element {
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

        //Removing a specific element


        System.out.println("Enter the element's index which you want to delete:");
        int index_to_delete = sc.nextInt();
        for (int i = index_to_delete; i < arr.length -1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = 0;

        for (int i:
                arr ) {
            System.out.print(i + " ");
        }




    }
}
