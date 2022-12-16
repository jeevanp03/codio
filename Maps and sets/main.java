import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class main {
    public static void main(String args[]) {
        Set<String> s = new TreeSet<>();
        s.add("I");
        s.add("think");
        s.add("sets");
        s.add("are");
        s.add("useful");
        s.add("data");
        s.add("structures");

        System.out.println(SetMapMethods.maxLength(s)); // 10

        List<Integer> l = new LinkedList<>();
        l.add(22);
        l.add(25);
        l.add(25);
        l.add(20);
        l.add(20);
        l.add(20);
        l.add(25);
        l.add(25);
        l.add(22);

        System.out.println(SetMapMethods.maxOccurrences(l)); // 4

        Map<String, Integer> m = new LinkedHashMap<>();
        m.put("Adele", 31);
        m.put("Simon", 45);

        System.out.println(SetMapMethods.rarest(m)); // 22
    }

}
