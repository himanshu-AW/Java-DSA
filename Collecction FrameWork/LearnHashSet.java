import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnHashSet {
    public static void main(String[] args) {
        // Set<Integer> set= new HashSet<>();  // elements stored in unOrder format
        // Set<Integer> set= new LinkedHashSet<>();  // elements stored in Order format
        Set<Integer> set= new TreeSet<>();  // elements stored in increasing Order foramt

        set.add(23);
        set.add(30);
        set.add(67);
        set.add(1);
        set.add(5);

        System.out.println(set);

        set.add(30);
        set.add(30);
        set.add(30);

        System.out.println(set);

        set.remove(67);
        System.out.println(set);

        System.out.println(set.contains(23));

        System.out.println(set.isEmpty());

        set.clear();
        System.out.println(set);
    }
}
