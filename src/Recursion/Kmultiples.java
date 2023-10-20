package Recursion;

public class Kmultiples {
//    static int mult(int m,int k){
//        if (k==1) return m;
//        int smallans = mult(m,k-1);
//        return m*k;
//    }
    static void multi(int p,int q){
        if(q==1){
            System.out.println(p);
            return;
        }
        multi(p,q-1);
        System.out.println(p*q);



    }
    public static void main(String[] args) {
        multi(5,10);
//        for (int i = 1; i <=8; i++) {
//            System.out.println(mult(5,i));
//        }
    }
}
