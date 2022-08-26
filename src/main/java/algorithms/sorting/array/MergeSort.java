package algorithms.sorting.array;

public class MergeSort {
    static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] lArr = new int[n1];
        int[] rArr = new int[n2];

        for (int i = 0; i < n1; i++) {
            lArr[i] = arr[l + i];
        }
        for (int i = 0; i < n2; i++) {
            rArr[i] = arr[m + 1 + i];
        }

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {
            if (lArr[i] <= rArr[j]) {
                arr[k++] = lArr[i++];
            }
            else {
                arr[k++] = rArr[j++];
            }
        }

        while (i < n1) {
            arr[k++] = lArr[i++];
        }
        while (j < n2) {
            arr[k++] = rArr[j++];
        }
    }

    static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (r - l) / 2 + l;

            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public static void main(String[] args) {
        int[] arr = {7,4,8,1,2,8,7,4,2};

        mergeSort(arr, 0, arr.length - 1);

        for (var x : arr) {
            System.out.print(x + " ");
        }
    }
}
