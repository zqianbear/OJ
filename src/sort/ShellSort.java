/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

/**
 *
 * @author zhengqian
 */
public class ShellSort {

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
        int d = 5;
        if (array.length > 0) {
            shellSort(array, d);
        }
    }

    public static void shellSort(int[] array, int d) {
        while (d >= 1) {
            shell(array, d);
            d = d/2;
        }
    }

    public static void shell(int[] array, int d) {
        int len = array.length;
        for (int i = d; i < len; i++) {
            for (int j = i; j >= d; j-=d) {
                if (array[j] < array[j - d]) {
                    int temp = array[j];
                    array[j] = array[j - d];
                    array[j - d] = temp;
                }
            }
        }

    }
}
