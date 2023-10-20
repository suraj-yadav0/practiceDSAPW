package College_Java.firstday;

import java.util.Scanner;

public class power {
    static int power(int value, int pow){
        int ans = 1;

        for (int i = 1; i <= pow ; i++) {
            ans = value * ans;
        }

        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Enter the value:");
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        System.out.println("Enrer the power:");
        int pow = sc.nextInt();
        System.out.println("Required Ans = " +  power(val,pow));
    }
}
