package Recursion.String;

import java.util.Scanner;

public class class38 {
    static String removeA2(String S ){
        if (S.length() == 0) return " ";
        String smallAns = removeA2(S.substring(1));
        char currentItem = S.charAt(0);
        if (currentItem != 'a'){
            return currentItem + smallAns;
        }else {
            return smallAns;
        }
    }
    static String removeA(String S , int idx){
        if (idx == S.length()) return " ";

        String smallAns = removeA(S,idx+1);

        char curritem = S.charAt(idx);

        if (curritem != 'a'){
            return curritem + smallAns;}
        else {
            return smallAns;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String name  = sc.nextLine();
//      System.out.println(name.substring(0,name.length()));
//        String S = "abcdx";
//        String ans = " ";
//        for (int i = 0; i < S.length(); i++) {
//            if (S.charAt(i) != 'a'){
//                ans += S.charAt(i);
//            }
//        }
//        System.out.println(ans);
        System.out.println(removeA(name,0));
        System.out.println(removeA2(name));

}}
