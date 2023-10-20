package College_Java.Sept7;

public class special {
    static boolean isPrime(int n)
    {

        if(n == 1 || n == 0) return false;


        for(int i = 2; i < n; i++)
        {
            if(n % i == 0) return false;
        }

        return true;
    }
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i) &&  i%2 == 0 || i %3 == 0 || i %5 ==0 ) {
                System.out.println(i);
            }
        }
    }
}
