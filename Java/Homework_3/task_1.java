package Homework_3;
// Реализовать алгоритм сортировки слиянием
public class task_1 {

    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 7, 1, 3, 2, 6};
        mergeSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);
            merge(arr, left, middle, right);
        }
    }

    public static void merge(int[] arr, int left, int middle, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = middle + 1;
        int k = 0;

        while (i <= middle && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                k++;
                i++;
            } else {
                temp[k] = arr[j];
                k++;
                j++;
            }
        }

        while (i <= middle) {
            temp[k] = arr[i];
            k++;
            i++;
        }

        while (j <= right) {
            temp[k] = arr[j];
            k++;
            j++;
        }

        for (i = left; i <= right; i++) {
            arr[i] = temp[i - left];
        }
    }

}
