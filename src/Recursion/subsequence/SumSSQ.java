package Recursion.subsequence;

import java.util.Scanner;

public class SumSSQ {

    static void printSumSsq(int [] s, int idx , int sum){
        if (idx >= s.length){
            System.out.println(sum);
            return;
        }
         printSumSsq(s,idx+1,sum + s[idx]);
        printSumSsq(s,idx+1,sum);
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println("Enter the Integer valus of the array:");
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        printSumSsq(arr,0,0);


    }
}
