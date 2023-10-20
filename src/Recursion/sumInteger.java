package Recursion;

public class sumInteger {
    static int sod (int n){
        if (n >= 0 && n<= 9){
            return n;
        }
        int smallans = sod(n/10);
         int ans = smallans + sod(n%10);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(sod(12345));
    }
}
