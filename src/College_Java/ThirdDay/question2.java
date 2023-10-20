package College_Java.ThirdDay;

import java.util.Scanner;

public class question2 {

    static int[] sumZero(int arr[]){
        int ans[] = new int[15];
        int k = 0;
        int sum ;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] +  arr[j] == 0){
                    ans[k++] = arr[i];
                    ans[k++] = arr[j];
                }else {
                    sum += arr[j];
                    if (sum == 0){
                        ans[k++] = arr[i];
                        ans[k++] = arr[j];
                    }
                }

            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Enter no. of elements of the Array:");
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans[] = sumZero(arr);

        for (int i:
             ans) {
            System.out.print(i + " ");
        }


    }
        }
