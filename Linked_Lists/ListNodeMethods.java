public class ListNodeMethods {

    // before:
    // list -> 1 -> 2
    // after list = append(list, 3):
    // list -> 1 -> 2 -> 3
    public static ListNode append(ListNode list, int value) {
        // TODO: add your code for the first question here
        ListNode temp = new ListNode(value);
        list.next.next = temp;
        return list;
    }

    // before:
    // list -> 1 -> 2
    // after list = prepend(list, 3):
    // list -> 3 -> 1 -> 2
    public static ListNode prepend(ListNode list, int value) {
        ListNode temp = new ListNode(value);
        temp.next = list;
        list = temp;
        return list;
    }

    // before:
    // list -> 1 -> 2 -> 3
    // temp -> 4 -> 5 -> 6
    // after: list = rearrangeLists(list, temp):
    // return list -> 5 -> 3 -> 4 -> 2
    public static ListNode rearrangeLists(ListNode list, ListNode temp) {
        // TODO: add your code for the third question here
        ListNode newList = temp.next;
        newList.next = list.next.next;
        newList.next.next = temp;
        newList.next.next.next = list.next;
        return newList;
    }

    public static void change(ListNode list, ListNode b) {
        ListNode tempA = list;

        ListNode tempB = b;

        tempA.next = b.next;

        tempA.next.next = list.next.next;

        tempB = list.next;

        tempB.next = b;
    }

}
