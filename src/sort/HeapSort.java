/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

/**
 *
 * @author zhengqian
 */
public class HeapSort {

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
            heapSort(array);
        }
    }

    public static void heapSort(int[] array) {

        buildHeap(array);

    }
    
    public static void buildHeap(int[] array) {
        int len = array.length;
        int temp = 0;
        for (int i = len / 2; i > 0; i--) {
            shift(array, i - 1, len);
        }
        for (int i = len - 2; i >= 0; i--) {
            temp = array[i + 1];
            array[i + 1] = array[0];
            array[0] = temp;
            shift(array, 0, i + 1);
        }
    }
    
    public static void shift(int[] array, int i, int n) {
        
        int j = 0;
        int temp = array[i];
        j = 2 * i + 1;
        while (j <= n - 1) {
            if (j < n - 1 && array[j] < array[j + 1]) {
                j++;
            }
            if (temp >= array[j]) {
                break;
            }
            array[(j - 1) / 2] = array[j];
            j = 2 * j + 1;
        }
        array[(j - 1) / 2] = temp;
    }
}
