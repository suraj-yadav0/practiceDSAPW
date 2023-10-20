package Recursion.Array;

import java.util.Scanner;

public class linearSearch {
    static int searchIDX(int arr[],int target ,  int idx){
        if (idx >= arr.length){
            return -1;
        }
        if (arr[idx] == target) return idx;

        return  searchIDX(arr,target,idx+1);


    }

    static void PrintFoundIDX(int arr[],int target ,  int idx){
        if (idx >= arr.length){
            return;
        }
        if (arr[idx] == target) {
            System.out.println(idx);
        }

        PrintFoundIDX(arr,target,idx+1);


    }
    public static void main(String[] args) {
        System.out.println("Enter the size of the Array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the elements of the Array:");
        int arr [] = new int[n];
        for (int i = 0; i < n; i++) {
             arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Traget element:");
        int target = sc.nextInt();
//        if (search(arr,target,0)){ // This one prints the YEs or No for element found or  not
//            System.out.println("Yes");
//        }else {
//            System.out.println("No");
//        }
      //  System.out.println(searchIDX(arr,target,0)); // This one prints the found elements index
        PrintFoundIDX(arr,target,0);

    }
    static boolean search(int arr[],int target ,  int idx){
     if (idx >= arr.length){
         return false;
     }
     if (arr[idx] == target) return true;

    return search(arr,target,idx+1);


    }
}
