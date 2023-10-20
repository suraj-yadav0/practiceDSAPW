package Recursion;

import java.util.Scanner;

public class PrintNumbers {
    static void print_number(int n){
        if ( n == 1){
            System.out.println(1);
            return;
        }
        print_number(n-1);
        System.out.println(n);
    }
    static  void print_decreesing(int n){
        if (n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        print_decreesing(n-1);
    }
    public static void main(String[] args) {
        System.out.println("Enter the value of n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print_number(n);
        System.out.println("In reverse order:");
        print_decreesing(n);
    }
}
