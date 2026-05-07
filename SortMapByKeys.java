package Day11;

import java.util.*;

public class SortMapByKeys {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(3, "Three");
        map.put(1, "One");
        map.put(4, "Four");
        map.put(2, "Two");

        System.out.println("Original Map: " + map);

        // TreeMap sorts by keys automatically
        Map<Integer, String> sortedMap = new TreeMap<>(map);

        System.out.println("Sorted Map by Keys: " + sortedMap);
    }
}
