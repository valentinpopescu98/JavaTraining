package data_structures;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>(Map.of(
                'a', 1,
                'b', 2,
                'c', 3,
                'd', 4,
                'e', 5
        ));

        System.out.println(map.get('a'));
        System.out.println(map.get('b'));
        System.out.println(map.get('c'));
        System.out.println(map.get('d'));
        System.out.println(map.get('e'));

        System.out.println(map.get('f'));
        System.out.println(map.get('A'));
    }
}
