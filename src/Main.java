import java.util.Scanner;

public class Main {
    static void print(int n,int i){

        if (i<=n){
            System.out.println(i);
            i++;
            print(n,i);
        }else {
            return;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the value of n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n,1);
    }
}