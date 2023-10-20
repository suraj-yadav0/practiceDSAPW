package BruteForce;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        System.out.println("Enter two integers:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = Math.min(a,b);
        for (int i = c; i > 0; i--) {
            if (a%i==0 && b%i==0){
                System.out.println(i);
                return;
            }
        }
    }
}
