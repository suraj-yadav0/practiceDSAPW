package Strings;

import java.util.Scanner;

public class toogle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str =   new StringBuilder(sc.nextLine());

        System.out.println(str);

        for (int i = 0; i < str.length(); i++) {
            boolean flag = true;//capital

            char ch = str.charAt(i);

            if (ch == ' ') continue;
            int asci = (int) ch;

            if (asci >= 97) flag = false;//small

            if (flag == false) { //small
                asci-=32;
                char dh = (char) asci;
                str.setCharAt(i,dh);
            }else {
                asci+=32;
                char dh = (char) asci;
                str.setCharAt(i,dh);
            }
        }

        System.out.println(str);

    }
}
