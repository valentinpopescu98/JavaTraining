package data_structures;

import java.util.*;

public class RedBlackTreeEx {
    static <K,V extends Comparable<? super V>> SortedSet<Map.Entry<K,V>> entriesSortedByValues(Map<K,V> map) {
        SortedSet<Map.Entry<K,V>> sortedEntries = new TreeSet<>(
                (e1, e2) -> {
                    int res = e1.getValue().compareTo(e2.getValue());
                    return res != 0 ? res : 1;
                }
        );

        sortedEntries.addAll(map.entrySet());
        return sortedEntries;
    }

    public static void main(String[] args) {
        TreeMap<Integer, Integer> redBlackTree = new TreeMap<>(Comparator.naturalOrder());
        redBlackTree.putAll(Map.of(
                0, 1,
                1, 5,
                2, 6,
                3, 4,
                4, 3,
                5, 7
        ));

        for (int node : redBlackTree.keySet()) {
            System.out.print(redBlackTree.get(node) + " ");
        }
    }
}
