import java.util.Arrays;

public class ArrayIntList {
    private int size;
    private int[] data;

    public ArrayIntList() {
        this(2);
    }

    public ArrayIntList(int capacity) {
        size = 0;
        data = new int[capacity];
    }

    public int size() {
        return size;
    }

    public int get(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException();
        }
        return data[i];
    }

    public void add(int value) {
        if (size >= data.length) {
            grow(); // hide details in grow method
        }
        data[size] = value;
        size++;
    }

    private void grow() {
        int[] newData = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i]; // copy data
        }
        data = newData; // data now points to array
                        // with twice the capacity
    }

    // TODO: add your runningTotal method here
    public ArrayIntList runningTotal() {
        if (this.size == 0) {
            ArrayIntList empty = new ArrayIntList();
            return empty;
        } else {
            int length = this.data.length;
            ArrayIntList sum = new ArrayIntList();
            for (int i = 0; i < length; i++) {
                if (i == 0) {
                    sum.add(this.data[0]);
                } else {
                    sum.add(this.data[i] + sum.data[i - 1]);
                }
            }
            return sum;
        }

    }

}
