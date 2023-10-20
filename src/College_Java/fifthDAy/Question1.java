package College_Java.fifthDAy;

import java.util.Scanner;

public class Question1 {

    static void print (int arr[] [],int row , int col ) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void difference(int arr[] [],int row , int col ,int arr2[] [],int row2 , int col2 ) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col ; j++) {
                System.out.print(arr[i][j] - arr2[i][j] +  " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of Row:");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        System.out.println("Enter the size of Col:");
        int col  = sc.nextInt();
        int [] [] arr = new int[row][col];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col ; j++) {
                System.out.println("Enter the element at:"+ i + j);
                arr[i] [j] = sc.nextInt();
            }
        }


        System.out.println("Enter the size of Row of Second Array:");

        int row2 = sc.nextInt();
        System.out.println("Enter the size of Col:");
        int col2  = sc.nextInt();
        int [] [] arr2 = new int[row][col];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col ; j++) {
                System.out.println("Enter the element at:"+ i + j);
                arr2[i] [j] = sc.nextInt();
            }
        }

        difference(arr,row,col,arr2,row2,col2);



    }
}
