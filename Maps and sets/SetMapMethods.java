
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SetMapMethods {
    public static int maxLength(Set<String> s) {
        int max = 0;
        if (s.isEmpty()) {
            return max;
        } else {
            for (String test : s) {
                max = Math.max(max, test.length());
            }
            return max;
        }

    }

    public static int maxOccurrences(List<Integer> l) {
        int max = 0;
        HashMap<Integer, Integer> storage = new HashMap<>();
        for (int value : l) {
            if (!storage.containsKey(value)) {
                storage.put(value, 1);
            } else {
                storage.put(value, storage.get(value) + 1);
            }
        }
        for (int key : storage.keySet()) {
            max = Math.max(max, storage.get(key));
        }
        return max;
    }

    public static int rarest(Map<String, Integer> m) {
        HashMap<Integer, Integer> storage = new HashMap<>();
        if (m.isEmpty()) {
            throw new IllegalArgumentException();
        } else {
            for (int value : m.values()) {
                if (!storage.containsKey(value)) {
                    storage.put(value, 1);
                } else {
                    storage.put(value, storage.get(value) + 1);
                }
            }
            int min = 0;
            int rarest = 0;
            int index = 0;
            for (int key : storage.keySet()) {
                if (index == 0) {
                    min = storage.get(key);
                    rarest = key;
                    index++;
                } else {
                    if (min > Math.min(min, storage.get(key))) {
                        min = Math.min(min, storage.get(key));
                        rarest = key;
                    } else if (min == Math.min(min, storage.get(key))) {
                        if (key < rarest) {
                            rarest = key;
                        }
                    }

                }
            }
            return rarest;
        }
    }
}