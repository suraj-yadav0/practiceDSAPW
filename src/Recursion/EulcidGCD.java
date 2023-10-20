package Recursion;

import java.util.Scanner;

public class EulcidGCD {

    static int Eulcid(int x,int y){
        if (y==0){
            return x;
        }
        return Eulcid(y,x%y);
    }
    public static void main(String[] args) {
        System.out.println("Enter any Integer:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(Eulcid(n,y));

    }
}
