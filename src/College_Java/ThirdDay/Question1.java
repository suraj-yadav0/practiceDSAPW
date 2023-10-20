package College_Java.ThirdDay;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        System.out.println("Enter no. of elemets of the Array:");
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean check  = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] != arr[j] && i !=j){
                 check = true;
                }
                else {
                    check = false;
                    continue;
                }

            }

           if (check){
                System.out.println(arr[i]);
               break;
            }
        }}

    }

