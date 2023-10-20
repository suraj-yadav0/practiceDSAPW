package Recursion.subsequence;

import java.util.ArrayList;
import java.util.Scanner;

public class ReturnSubsequenc {

    static ArrayList<String> returnSSQ(String s){
        ArrayList<String> ans = new ArrayList<>();
        if (s.length() == 0){
            ans.add("");
            return ans;
        }
        char curr = s.charAt(0);
        ArrayList<String> smallAns = returnSSQ(s.substring(1));
        for (String ss : smallAns){
            ans.add(ss);
            ans.add(curr + ss);
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Enter the value Of a String:");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
       // System.out.println(returnSSQ(s));
        for (String ss : returnSSQ(s)){
            System.out.println(ss);
        }
    }
}
