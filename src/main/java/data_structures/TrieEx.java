package data_structures;

import java.util.Locale;

public class TrieEx {
    static void insert(TrieNode root, String word) {
        word = word.toLowerCase(Locale.ROOT);

        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';

            if (root.children[index] == null) {
                root.children[index] = new TrieNode();
            }

            root = root.children[index];
        }

        root.isLastElement = true;
    }

    static boolean search(TrieNode root, String word) {
        word = word.toLowerCase(Locale.ROOT);

        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';

            if (root.children[index] == null) {
                return false;
            }

            root = root.children[index];
        }

        return true;
    }

    public static void main(String[] args) {
        String[] keys = {"casanova", "drogat"};
        TrieNode root = new TrieNode();

        for (int i = 0; i < keys.length; i++) {
            insert(root, keys[i]);
        }

        System.out.println("drog: " + search(root, "drog"));
        System.out.println("drob: " + search(root, "drob"));
        System.out.println("droga: " + search(root, "droga"));
        System.out.println("casa: " + search(root, "casa"));
        System.out.println("nova: " + search(root, "nova"));
        System.out.println("ca: " + search(root, "ca"));
        System.out.println("casangiu: " + search(root, "casangiu"));
    }
}
