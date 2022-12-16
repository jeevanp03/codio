public class ListNodeTraversal {

    // before:
    // list -> 7 -> ... -> 16
    // after list = changeAllValues(list, 42):
    // list -> 42 -> ... -> 42
    public static ListNode changeAllValues(ListNode list, int value) {
        // TODO: add your code for the first question here
        ListNode current = list;
        while (current != null) {
            current.data = value;
            current = current.next;
        }
        return list;
    }

    // before:
    // list -> 7 -> ... -> 3
    // after list = changeLast(list, 42):
    // list -> 7 -> ... -> 42
    public static ListNode changeLast(ListNode list, int value) {
        // TODO: add your code for the second question here
        ListNode current = list;
        while (current != null) {
            
            if(current.next == null){
                current.data = value;
            }
            current = current.next;
        }
        
        
        return list;
    }

    // before:
    // list -> 7 -> ... -> 3
    // after list = addLast(list, 42):
    // list -> 7 -> ... -> 3 -> 42
    public static ListNode addLast(ListNode list, int value) {
        // TODO: add your code for the third here
        ListNode current = list;
        ListNode temp = new ListNode(value);
        while (current != null) {
            
            if(current.next == null){
                current.next = temp;
                break;
            }
            current = current.next;
        }
        
        return list;
    }
}
