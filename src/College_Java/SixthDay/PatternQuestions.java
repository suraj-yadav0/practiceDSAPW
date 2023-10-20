package College_Java.SixthDay;

public class PatternQuestions {
    public static void main(String[] args) {
//        for (int i = 0; i < 7; i++) {
//            for (int j = 0; j < 7; j++) {
//              if (i==j || i + j == 6) {
//                  System.out.print("x" +  " ");
//              }else {
//                  System.out.print(" ");
//              }
//            }
//            System.out.println();
//        }
//
//        for (int i = 0; i < 7; i++) {
//            for (int j = 0; j < 7; j++) {
//                if (i==j || i + j == 6) {
//                    System.out.print("x" +  " ");
//                }else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//
//        for (int i = 0; i < 7; i++) {
//            for (int j = 0; j < 7; j++) {
//                if (i==j || i + j == 6) {
//                    System.out.print("x" +  " ");
//                }else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }


        int n = 6;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i  +  j ) == n-1 ) {
                    System.out.print("X");
                }else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }
}
