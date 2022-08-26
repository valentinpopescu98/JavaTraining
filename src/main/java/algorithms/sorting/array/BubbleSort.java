package algorithms.sorting.array;

public class BubbleSort {
    static void swapArr(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swapArr(arr, i, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {7,4,8,1,2,8,7,4,2};

        bubbleSort(arr);

        for (var x : arr) {
            System.out.print(x + " ");
        }
    }
}
