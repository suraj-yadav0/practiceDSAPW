package Recursion.String;

import java.util.Scanner;

public class reverseString {
    static String reverseS2(String s){
        if (s.length()==0) return "";
        String smallans = reverseS2(s.substring(1));
        return smallans + s.charAt(0);
    }
    static String reverseS(String s, int idx){
        if (idx == s.length()) return " ";
        String smallAns = reverseS(s,idx+1);
        return smallAns + s.charAt(idx);

    }
    public static void main(String[] args) {
        System.out.println("Enter the value of String:");
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
//        System.out.println(reverseS(S,0));
//        System.out.println(reverseS2(S));
        String rev = reverseS2(S);
        System.out.println(rev);
        if (rev.equals(S)){
            System.out.printf("%s is a Palindrome", S);
        }else {
            System.out.printf("%s is not a palindrome", S);
        }

    }
}
