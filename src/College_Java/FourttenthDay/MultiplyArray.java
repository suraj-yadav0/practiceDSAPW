package College_Java.FourttenthDay;

import java.util.Scanner;

public class MultiplyArray {


    static void print (int[][] arr, int row, int col){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void multiply(int[][] arr,int row,int col, int[][] arr2,int row2,int col2){
        int arr3[][] = new int[row][col2];

        if (row != col2) {
            return ;
        }
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//             arr3[i][j] = arr[i][j] * arr2[i][j];
//            }
//        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr3[i][j] = 0 ;
                for (int k = 0; k < col; k++) {
                    arr3[i][j] += arr[i][k] * arr2[k][j];
                }
            }
        }

        print(arr3,row,col);
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
        System.out.println("Enter the size of second Row:");

        int row2 = sc.nextInt();
        System.out.println("Enter the size second of Col:");
        int col2  = sc.nextInt();
        int [] [] arr2 = new int[row2][col2];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2 ; j++) {
                System.out.println("Enter the element at:"+ i + j);
                arr2[i] [j] = sc.nextInt();
            }
        }

        multiply(arr,row,col,arr2,row2,col2);
    }
}
