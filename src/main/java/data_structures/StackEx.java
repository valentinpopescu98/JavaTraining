package data_structures;

import java.util.List;
import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        stack.addAll(List.of('A', 'B', 'C', 'D', 'E'));
        System.out.println(stack);

        stack.push('Z');
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);
    }
}
