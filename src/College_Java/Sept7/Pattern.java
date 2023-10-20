package College_Java.Sept7;

public class Pattern {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }

            int k = 1;
            for (int j = 0; j < 2 * i - 1; j++) {

                System.out.print(k++);
            }
            System.out.println();
        }
    }
}
