import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class learnList {
    public static void main(String[] args) {

        // ArrayList & list are Same.

        // List<Integer> list = new ArrayList<>();
        List<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(12);
        list.add(123);
        list.add(1234);

        System.out.println(list.toString());

        list.add(44);
        System.out.println(list);

        list.add(1,59);
        System.out.println(list);

        // we can another arraylist / linkedlist
        // List<Integer> list2 =  new ArrayList<>();
        List<Integer> list2 =  new LinkedList<>();
        list2.add(99);
        list2.add(88);

        // add all element from list-2 to list-1
        list.addAll(list2);
        System.out.println(list);

        System.out.println("Getting elem at 1 index: "+list.get(1));

    }
}
