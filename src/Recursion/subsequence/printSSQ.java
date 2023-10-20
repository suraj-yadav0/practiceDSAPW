package Recursion.subsequence;

import java.util.Scanner;

public class printSSQ {
    static void printSSq(String s, String currAns){
        if (s.length() == 0){
            System.out.println(currAns);
            return;
        }
        char currchar = s.charAt(0);
        String remString = s.substring(1);
        printSSq(remString,currAns + currchar);
        printSSq(remString,currAns);
    }
    public static void main(String[] args) {
        System.out.println("Enter the value Of a String:");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        printSSq(s,"");
    }
}
