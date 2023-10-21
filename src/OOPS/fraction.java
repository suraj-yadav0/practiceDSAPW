package OOPS;

public class fraction {

    public static int gcd(int num, int deno){
        int min = Math.min(num,deno);
        for (int i = min; i >= 1  ; i--) {
if (num%i == 0 && deno % i==0) {
    return i;
}
        }
        return min;
    }
    public static void main(String[] args) {

    }
}
