package com.algrithm.sort;

/**
 * 直接选择排序
 * 每次选择后一部分最小的数排列到前面
 */
public class DirectSort {

    private static int[] arr = {2, 0, 9, 1, 6, 7, 4, 12, 10, 22, 34, 1, 19, 21, 2, 5};

    public static void main(String[] args) {
        int[] result = sort(arr);
        for (int i : result) {
            System.out.print(i + ",");
        }
    }

    private static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }

        }
        return arr;
    }
}
