package College_Java.firstday;

import java.util.Scanner;

public class primeIndex {

    static void print (int arr[] , int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
   static boolean isPrime(int n)
    {

        if(n == 1 || n == 0) return false;


        for(int i = 2; i < n; i++)
        {
            if(n % i == 0) return false;
        }

        return true;
    }
    public static void main(String[] args) {
        // print the prime indexes
        System.out.println("Enter the size of the Array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the Array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
      //  print(arr,n);

//        for (int i = 2; i < n; i++) {
//            for (int j = 2; j < n; j++) {
//                if (j % i != 0) {
//                    System.out.print(j + " ");
//                }
//            }
//            break;
//        }


        for (int i = 0; i < n; i++) {
            int element[] = new int[789633];
            for (int j = 0; j < element.length; j++) {
                int rem = arr[i] % 10;
                element[j] = rem;
            }
            for (int j = 0; j < element.length; j++) {
                if (isPrime(element[j])) {
                    System.out.println(element[j] +  " ");
                }
            }
        }
    }
}
