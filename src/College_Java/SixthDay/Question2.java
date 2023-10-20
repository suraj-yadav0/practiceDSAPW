package College_Java.SixthDay;

import java.util.Scanner;

public class Question2 {

    static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
    }

    static void diagBoundry(int[][] arr, int row, int col, int[][] arr2, int row2, int col2){

        int Row = Math.min(row, row2);
        int Col = Math.min(col, col2);
        for (int i = 0; i < Row ; i++) {
            for (int j = 0; j < Col; j++) {
                if ((i==0 && j==0 )|| i+j == (Math.min(arr.length, arr2.length)-1)){
                   // swap(arr[i][j],arr2[i][j]);

                    int temp = arr[i][j];
                    arr[i][j] = arr2[i][j];
                    arr2[i][j] = temp;
                }
            }
        }


        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Col; j++) {
                if (i==0 && (j!=0 || j!= arr.length-1)){
                   // swap(arr[i][j],arr2[i][j]);

                    int temp = arr[i][j];
                    arr[i][j] = arr2[i][j];
                    arr2[i][j] = temp;
                }
            }
        }

        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Col; j++) {
                if (j== arr.length-1 && (i!=0 || i!= arr.length-1)){
                   // swap(arr[i][j],arr2[i][j]);

                    int temp = arr[i][j];
                    arr[i][j] = arr2[i][j];
                    arr2[i][j] = temp;
                }
            }
        }


        print(arr, row, col);
        System.out.println();
        print(arr2, row2, col2);
    }

    static void print(int arr[][], int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter the size of Row:");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        System.out.println("Enter the size of Col:");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter the element at:" + i + j);
                arr[i][j] = sc.nextInt();
            }
        }


        System.out.println("Enter the size of Row of Second Array:");

        int row2 = sc.nextInt();
        System.out.println("Enter the size of Col:");
        int col2 = sc.nextInt();
        int[][] arr2 = new int[row][col];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.println("Enter the element at:" + i + j);
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("Before Results:");

        print(arr, row, col);
        System.out.println();
        print(arr2, row2, col2);
        diagBoundry(arr, row, col, arr2, row2, col2);

    }
}
