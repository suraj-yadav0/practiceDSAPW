package College_Java.SeventhDay;

import java.util.Scanner;

public class RotateBoundries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the number of row of matrix");
        a=sc.nextInt();
        System.out.println("Enter the number of column of matrix");
        b=sc.nextInt();
        System.out.println("Enter the values of matrix");
        int arr1[][]=new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("Before Rotation:");
        for (int i = 0; i <a ; i++) {
            for (int j = 0; j <b ; j++) {
                System.out.print(arr1[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println();
        int r=arr1.length;
        int c=arr1[0].length;
        int nol=Math.min(r,c)/2;
        for(int i=0;i<nol;i++){
            int l1=i;
            int ln=Math.min(r,c)-i-1;

            int temp=arr1[l1][l1];// store top left element of that layer
            for(int j=l1;j<ln;j++){
                arr1[l1][j]=arr1[l1][j+1];// first row
            }
            for(int k=l1;k<ln;k++){
                arr1[k][ln]=arr1[k+1][ln];//last column
            }
            for(int p=ln;p>l1;p--){
                arr1[ln][p]=arr1[ln][p-1];//last row
            }
            for(int q=ln;q>l1;q--){
                arr1[q][l1]=arr1[q-1][l1];//first column
            }
            arr1[l1+1][l1]=temp;//restore to bottom right

        }
        System.out.println("After Rotation ")
        ;
        for(int[]r1:arr1){
            for(int n:r1){
                System.out.print(n+" ");
            }
            System.out.println();

        }
    }
}
