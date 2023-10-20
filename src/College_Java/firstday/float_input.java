package College_Java.firstday;

import java.util.Scanner;

public class float_input {
    public static void main(String[] args) {
        System.out.println("Enter a value:");
        Scanner sc  = new Scanner(System.in);
        float a = sc.nextFloat();
        System.out.println("Enter another value:");
        float b = sc.nextFloat();
        System.out.println("Sum = " + (a+b));
    }
}
