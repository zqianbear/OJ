package sort;

public class QuickSort {

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        int[] array1 = {26, 54, 32, 16, 17, 29, 42, 29, 17, 64};
        int[] array2 = {18, 11};
        int[] array3 = {};
        sort(array1);
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
    }

    public static void sort(int[] array) {
        if (array.length > 0) {
            quickSort(array, 0, array.length - 1);
        }
    }

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int middle = partition(array, low, high);
            quickSort(array, low, middle - 1);
            quickSort(array, middle + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int privot = arr[low];
        while (low < high) {
            while (low < high && arr[high] >= privot) {
                high--;
            }
            arr[low] = arr[high];
            while (low < high && arr[low] <= privot) {
                low++;
            }
            arr[high] = arr[low];
        }
        arr[low] = privot;
        return low;
    }
}