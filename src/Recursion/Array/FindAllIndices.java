package Recursion.Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class FindAllIndices {
    static ArrayList<Integer> allIndices(int arr[] , int target , int idx){
        if (idx>= arr.length){
            return new ArrayList<Integer>();
        }
        ArrayList<Integer> ans = new ArrayList<>();
        if (arr[idx] == target){
            ans.add(idx);
        }
        ArrayList<Integer> smallAns = allIndices(arr,target,idx+1);
        ans.addAll(smallAns);
        return ans;
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
        System.out.println(allIndices(arr,target,0));

    }
}
