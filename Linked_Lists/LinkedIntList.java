import java.util.Iterator;

public class LinkedIntList implements Iterable<Integer> {
    // DO NOT ALTER THE FIELDS IN ANY WAY
    private ListNode front;

    // Constructs a new empty list.
    // DO NOT ALTER THIS CONSTRUCTOR IN ANY WAY
    public LinkedIntList() {
        front = null;
    }

    // Adds the given value to the end of the list.
    // DO NOT ALTER THIS METHOD IN ANY WAY
    public void add(int value) {
        if (front == null) {
            // adding to an empty list
            front = new ListNode(value);
        } else {
            // adding to the end of an existing list;
            // traverse to the last node in the list so we can append to it
            ListNode current = front;
            while (current.next != null) {
                current = current.next;
            }

            // at this point, current.next == null,
            // and current refers to the last node
            current.next = new ListNode(value);
        }
    }

    // Returns a String representation of this LinkedIntList
    // DO NOT ALTER THIS METHOD IN ANY WAY
    @Override
    public String toString() {
        String str = "front ";
        ListNode current = front;
        while (current != null) {
            str += "-> [" + current.data + "] ";
            current = current.next;
        }
        str += "/";
        return str;
    }

    // Returns an iterator (to use foreach loop in unit tests)
    // DO NOT ALTER THIS METHOD IN ANY WAY
    @Override
    public Iterator<Integer> iterator() {
        return new LinkedIterator();
    }

    // Class for iterating over LinkedIntList
    // DO NOT ALTER THIS INNER CLASS IN ANY WAY
    private class LinkedIterator implements Iterator<Integer> {
        private ListNode current;

        public LinkedIterator() {
            current = front;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Integer next() {
            int data = current.data;
            current = current.next;
            return data;
        }

    }

    // TODO: add your method here
    private static ListNode prepend(ListNode list, int value) {
        ListNode temp = new ListNode(value);
        temp.next = list;
        list = temp;
        return list;
    }

    public void split() {
        ListNode current = this.front;
        if (current.next == null) {
            return;
        }
        while (current.next != null) {
            if (current.next.data < 0) {
                ListNode temp = current.next;
                current.next = current.next.next;
                temp.next = this.front;
                this.front = temp;
            } else {
                current = current.next;
            }
        }
    }

    public void split2() {
        ListNode helper = null;
        ListNode current = this.front;
        if (current != null) {
            while (current.next != null) {
                if (current.next.data < 0) {
                    ListNode temp = current.next.next;
                    current.next.next = this.front;
                    this.front = current.next;
                    current.next = temp;
                } else {
                    current = current.next;
                }
            }
        }
    }
}
