public class main {
    public static void main(String[] args) {
        IntTree tree = new IntTree();
        tree.add(1, 10);
        tree.add(2, 5);
        System.out.println(tree.size());
        System.out.println(tree.depthSum());
    }
}
