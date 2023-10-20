package BruteForce;

import java.util.Arrays;

public class findUnique {
    public static void main(String[] args) {
        int arr[] = {3,2,4,7,7,6,5,2,3,1};
        int count  = 0;
        Arrays.sort(arr);
        for(int i = 1; i < arr.length - 2; i++) {
            if(arr[i] != arr[i-1] && arr[i] != arr[i+1]) {
                count++;
            }
        }
//edge case
        if(arr[arr.length -1] != arr[arr.length -2]) {
            count++;
        }

        System.out.println(count);
    }
}
