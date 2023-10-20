package Recursion.String;

import java.util.Scanner;

public class palindrome {
    static boolean ISpalindrome (String S , int k, int l){
        if (k >= l) return true;
        return (S.charAt(k) == S.charAt(l) && ISpalindrome(S,k+1,l-1));
    }
    public static void main(String[] args) {
        System.out.println("Enter the value of String:");
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        System.out.println(ISpalindrome(S,0,S.length()-1));

    }
}
