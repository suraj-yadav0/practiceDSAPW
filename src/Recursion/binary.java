package Recursion;

import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
        System.out.println("Enter any decimal number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(bin(n));

    }
    static int bin(int n){
        if (n == 0){
            return 0;
        }
        return (n%2+10 * bin(n/2));
    }
}
