package QuestionsOnString;
import java.util.*;
public class ToggleString {


    public static void main(String[] args) {
        String str = "PhySucs";
        for (int i = 0; i < str.length(); i++) {
            boolean flag = true;//capital

            char ch = str.charAt(i);

            if (ch == ' ') continue;
            int asci = (int) ch;

            if (asci >= 97) flag = false;//small

            if (flag == false) { //small
                asci-=32;
                char dh = (char) asci;
                str = str.substring(0,i) + dh + str.substring(i + 1);
            }else {
                asci+=32;
                char dh = (char) asci;
                str = str.substring(0,i) + dh + str.substring(i + 1);
            }
        }
        System.out.println(str);
    }
}
