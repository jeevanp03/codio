public class main {
    public static void main(String[] args) {
        HashIntSet set = new HashIntSet();
        // [-2, 3, 5, 6, 8]
        set.add(-2);
        set.add(3);
        set.add(5);
        set.add(6);
        set.add(8);
        String k = set.toString();
        System.out.println(k);
    }
}
