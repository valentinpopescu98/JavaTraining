package data_structures;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>(List.of('A', 'B', 'C', 'D', 'E'));
        System.out.println(list);

        list.add('Z');
        System.out.println(list);

        list.remove(2);
        System.out.println(list);
    }
}
