package College_Java.firstday;

import java.util.Scanner;
//find cube upto n integer
public class cube {
    public static void main(String[] args) {
        System.out.println("Enter a value:");
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            System.out.println(i*i*i);

        }
    }
}
