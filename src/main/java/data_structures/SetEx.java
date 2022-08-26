package data_structures;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEx {
    public static void main(String[] args) {
        Set<Character> set = new HashSet<>(List.of('A', 'B', 'B', 'A', 'C', 'D', 'C'));

        System.out.println(set);
    }
}
