package practice;

import java.util.Scanner;

public class question1 {

    static void print(float arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the number of elements of the Array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the value of Numerator array : ");
        float[] Numerator;
        Numerator = new float[n];
        for (int i = 0; i <n ; i++) {
            Numerator[i] = sc.nextFloat();
        }
      print(Numerator);
        System.out.println("Enter the value of Numerator array : ");
        float[] denominator;
        denominator = new float[n];
        for (int i = 0; i <n ; i++) {
            denominator[i] = sc.nextFloat();
        }

        print(denominator);
        int count = 0;

        for (int i = 1; i <n ; i++) {
            if ((Numerator[i] / denominator[i] )  + (Numerator[i-1] / denominator[i-1]) == 1) {
                count++;
            }
        }

        System.out.println("The value of count is:" + count);




    }
}
