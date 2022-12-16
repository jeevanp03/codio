public class ListNode {
    public static final char[] score = null;
    int data;
    ListNode next;

    public ListNode(int data) {
        this(data, null);
    }

    public ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }

    public ListNode prepend(ListNode current) {
        ListNode temp = this;
        current.next = temp;
        temp = current;
        return current;
    }

}
