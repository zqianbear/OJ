/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

/**
 *
 * @author zhengqian
 */
public class InsertSort {

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        int[] array1 = {26, 54, 32, 16, 17, 29, 42, 29, 17, 34};
        int[] array2 = {18, 11};
        int[] array3 = {};
        sort(array1);
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
    }

    public static void sort(int[] array) {
        if (array.length > 0) {
            insertSort(array);
        }
    }

    public static void insertSort(int[] array) {
        int len = array.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j >= 1; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }
}
