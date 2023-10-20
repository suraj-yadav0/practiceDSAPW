package College_Java.Sept7;

public class pattern2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            // This loop prints the space
            for (int j = 0; j < 5 - i ; j++) {
                System.out.print("  ");
            }

            if ( i >= 2) {
                //this loop prints left side 2nd row onwards
                for (int j = 2; j <= i  + 1 ; j++) {
                    System.out.print(j +" ");
                }
                //right side in 2nd row onwards
                for (int j = i; j >= 2; j--) {
                    System.out.print(j + " ");
                }
            }else {
                //prints 1st row
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
