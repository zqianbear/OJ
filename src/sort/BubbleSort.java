/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

/**
 *
 * @author zhengqian
 */
public class BubbleSort {

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
            bubbleSort(array);
        }
    }

    public static void bubbleSort(int[] array) {
        int len = array.length;
        boolean change = false;
        for (int i = 0; i < len; i++) {
            
            for (int j = 0; j < len - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    change = true;
                }
            }
            
            if (!change) {
                break;
            }

        }
    }
}
