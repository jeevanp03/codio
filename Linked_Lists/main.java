public class main {
    public static void main(String[] args) {
        ListNode list = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode b = new ListNode(4, new ListNode(5));
        ListNodeMethods.change(list, b);
        while (list != null) {
            System.out.println(list.data);
            list = list.next;
        }
        while (b != null) {
            System.out.println(b.data);
            b = b.next;
        }
    }
}
