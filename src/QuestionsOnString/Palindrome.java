package QuestionsOnString;

public class Palindrome {
    public static void main(String[] args) {
      String str = "tenet";
//        StringBuilder gtr = new StringBuilder(str);
//        gtr.reverse();
//        String s = gtr + "";
//        if (str.equals(s)) {
//            System.out.println("IsPalindrome");
//        }else {
//            System.out.println("IsNotPalindrome.");
//        }

        int i = 0;
        int j  = str.length() - 1;
        boolean flag = true;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                flag = false;
                break;
            }
            i++;
            j--;
        }

        if (flag == true) {
            System.out.println("IsPalnidrome");
        }else {
            System.out.println("NotPalnidrome");
        }
    }
}
