package Recursion;

public class count {
    static int counte(int n){
        if (n>=0 && n<=9){
            return 1;
        }
        int smallans = counte(n/10);
        int ans  = smallans + counte(n%10);
        return  ans;
    }
    public static void main(String[] args) {
        System.out.println(counte(12456));
    }
}
