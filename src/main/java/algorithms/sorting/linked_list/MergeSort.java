package algorithms.sorting.linked_list;

import data_structures.LinkedListNode;

public class MergeSort {
    static LinkedListNode findMiddle(LinkedListNode head) {
        if (head == null) {
            return head;
        }

        LinkedListNode slow = head, fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    static LinkedListNode merge(LinkedListNode left, LinkedListNode right) {
        LinkedListNode result = null;

        if (left == null) {
            return right;
        }
        else if (right == null) {
            return left;
        }

        if (left != null && right != null) {
            if (left.value <= right.value) {
                result = left;
                result.next = merge(left.next, right);
            }
            else {
                result = right;
                result.next = merge(left, right.next);
            }
        }

        return result;
    }

    static LinkedListNode mergeSort(LinkedListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        LinkedListNode m = findMiddle(head);

        LinkedListNode right = mergeSort(m.next);

        m.next = null;
        LinkedListNode left = mergeSort(head);

        return merge(left, right);
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

        head = mergeSort(head);

        while (head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        }
    }
}
