import java.util.ArrayList;
import java.util.Collections;

public class inputCommandLine {
    public static void main(String... args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add(args[0]);
        names.add(args[1]);
        names.add(args[2]);
        names.add(args[3]);
        names.add(args[4]);
        names.add(args[5]);
        System.out.println(names); // Noraml printing of the arrayList.
        Collections.sort(names);
        System.out.println(names); // Printing the arrayList after sorting.
        System.out.println(names.get(0)); // Minimum number
        System.out.println(names.get(5)); // Maximum Number
        System.out.println(Collections.max(names)); // maximum Number
        System.out.println(Collections.min(names)); // minimum Number
        Collections.sort(names, Collections.reverseOrder());
        System.out.println(names); // Printing the arrayList in reverse order after sorting.
        Collections.reverse(names);
        System.out.println(names); // Again reversed
        names.clear();
        System.out.println(names);
        
    }
}
