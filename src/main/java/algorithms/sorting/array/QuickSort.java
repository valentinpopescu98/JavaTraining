package algorithms.sorting.array;

public class QuickSort {
    static int partition(int[] arr, int l, int r) {
        int k = 0;

        for (int i = 0; i < r; i++) {
            if (arr[i] < arr[r]) {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k++] = temp;
            }
        }

        int temp = arr[k];
        arr[k] = arr[r];
        arr[r] = temp;

        return k;
    }

    static void quickSort(int[] arr, int l, int r) {
        if (l < r) {
            int pi = partition(arr, l, r);

            quickSort(arr, l, pi - 1);
            quickSort(arr, pi + 1, r);
        }
    }

    public static void main(String[] args) {
        int[] arr = {7,4,8,1,2,8,7,4,2};

        quickSort(arr, 0, arr.length - 1);

        for (var x : arr) {
            System.out.print(x + " ");
        }
    }
}
