package College_Java.SeventhDay;

import java.util.Scanner;

public class RotateArray {

    static void print(int [][] arr,int row,int col){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void rotateBy90(int[][] arr,int n) {

        // to find the transpose
        for (int i = 0; i < n; i++) {
            for (int j = i; j <n ; j++) {
                if (i!=j) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }

        //to do the reverse

        for (int i = 0; i < n; i++) {
            int low = 0; int high = n-1;
            while (low < high) {
                //swap
                int temp = arr[i][low];
                arr[i][low] = arr[i][high];
                arr[i][high] = temp;

                low++;
                high--;
            }
        }


    }
    public static void main(String[] args) {
//        System.out.println("Enter the size of Row:");
//        Scanner sc = new Scanner(System.in);
//        int row = sc.nextInt();
//        System.out.println("Enter the size of Col:");
//        int col = sc.nextInt();
//        int[][] arr = new int[row][col];
//        System.out.println("Enter the elements of the array:");
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                System.out.println("Enter the element at:" + i + j);
//                arr[i][j] = sc.nextInt();
//            }
//        }

        int matrix[][] = new int[][]{ {1,2,3,11}, {4,5,6,12} , {7,8,9,13},{12,13,14,15} };
        System.out.println("Before Swap:");
        print(matrix,4,4);

        rotateBy90(matrix,4);

        System.out.println("After Swap:");
       print(matrix,4,4);
    }
}
