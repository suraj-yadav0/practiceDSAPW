package College_Java.FourthDay;

public class swaastic {
    public static void main(String[] args) {

// This will print T
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5   ; j++) {
//               if(i == 4 || j== 4) {
//                   System.out.print("* ");
//               }else {
//                   System.out.print(" ");
//               }
//            }
//            System.out.println();
//        }


        // This will print X
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5  ; j++) {
//                if (i == j || i+j == 4){
//                    System.out.print("* ");
//               }else {
//                   System.out.print(" ");
//               }
//            }
//            System.out.println();
//        }


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 4 || j == 0 || j == 4) {
                    System.out.print(" " + "*");

                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }


    }
}
