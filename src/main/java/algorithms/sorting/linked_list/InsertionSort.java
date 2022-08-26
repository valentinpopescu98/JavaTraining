package algorithms.sorting.linked_list;

import data_structures.LinkedListNode;

public class InsertionSort {
    static LinkedListNode insert(LinkedListNode node, LinkedListNode sorted) {
        if (sorted == null || sorted.value >= node.value) {
            node.next = sorted;
            sorted = node;
        }
        else {
            LinkedListNode current = sorted;

            while (current.next != null && current.next.value < node.value) {
                current = current.next;
            }

            node.next = current.next;
            current.next = node;
        }

        return sorted;
    }

    static LinkedListNode insertionSort(LinkedListNode head) {
        LinkedListNode current = head;
        LinkedListNode sorted = null;

        while (current != null) {
            LinkedListNode next = current.next;
            sorted = insert(current, sorted);
            current = next;
        }

        return sorted;
    }

    public static void main(String[] args) {
        LinkedListNode head = new LinkedListNode(7);
        head.next = new LinkedListNode(4);
        head.next.next = new LinkedListNode(8);
        head.next.next.next = new LinkedListNode(1);
        head.next.next.next.next = new LinkedListNode(2);
        head.next.next.next.next.next = new LinkedListNode(8);
        head.next.next.next.next.next.next = new LinkedListNode(7);
        head.next.next.next.next.next.next.next = new LinkedListNode(4);
        head.next.next.next.next.next.next.next.next = new LinkedListNode(2);

        head = insertionSort(head);

        while (head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        }
    }
}
