package College_Java.secondDay;

import java.util.Scanner;

public class compare {
    Scanner sc = new Scanner(System.in);
    static int[] input(int[] arr){
        System.out.println("Enter elments of the array:");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
arr[i] = sc.nextInt();
        }
        return arr;


    }

static void print(int arr[]){
    for (int i:
            arr) {
        System.out.print(i + " ");
    }

}

static int common_element(int [] arr,int [] arr2, int [] arr3){
        int smallest = -1;
       int n = Math.max(arr.length,arr2.length);
       int m = Math.min(arr.length,arr2.length);
       int o = Math.max(m,arr3.length);
    for (int i = 0; i <n ; i++) {
        for (int j = 0; j < o; j++) {
            if (arr[i] == arr2[j] && arr[i] == arr3[j]){
                if (arr[i] < smallest){
                    smallest = arr[i];
                }
            }
        }

    }
    return smallest;
}

static boolean check(int [] arr,int smallest){
    for (int i = 0; i < arr.length; i++) {
        if (arr[i]< smallest){
            return false;
        }
    }
    return true;
}
    public static void main(String[] args) {
        System.out.println("Enter size of array:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
  int arr1[] = new int[a];
arr1 = input(arr1);

        System.out.println("Enter size of array:");

        int b = sc.nextInt();
        int arr2[] = new int[b];
        arr1 = input(arr1);


        System.out.println("Enter size of array:");
        int c = sc.nextInt();

        int arr3[] = new int[c];
        arr1 = input(arr1);


   int smallest_common =  common_element(arr1,arr2,arr3);
        System.out.println(check(arr3,smallest_common));

    }
}
