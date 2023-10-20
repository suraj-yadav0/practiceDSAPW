package practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Question2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("orange");
        list.add("papaya");
        list.add("garlic");

        Iterator itr = list.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }

        System.out.println("Before");

        for (String fruit:
                list ) {
            System.out.print(fruit);
        }

        Collections.sort(list);

        System.out.println("After:");

        for (String fruit:
                list ) {
            System.out.print(fruit);
        }

        for (int i = 0 ; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }

    }
}
