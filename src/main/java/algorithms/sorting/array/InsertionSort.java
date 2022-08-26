package algorithms.sorting.array;

public class InsertionSort {
    static void insertionSort(int[] arr) {
        int n = arr.length;

        for(int i = 1; i < n; ++i) {
            int key = arr[i];

            int j;
            for(j = i - 1; j >= 0 && arr[j] > key; --j) {
                arr[j + 1] = arr[j];
            }

            arr[j + 1] = key;
        }

    }

    public static void main(String[] args) {
        int[] arr = {7,4,8,1,2,8,7,4,2};

        insertionSort(arr);

        for (var x : arr) {
            System.out.print(x + " ");
        }
    }
}
