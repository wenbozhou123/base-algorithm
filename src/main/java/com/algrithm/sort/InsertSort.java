package com.algrithm.sort;

/**
 * 插入排序
 * 前面是一排序的数组
 * 依次轮询未排序部分，插入到有序数组中
 */
public class InsertSort {

    private static int[] arr = {2, 0, 9, 1, 6, 7, 4, 12, 10, 22, 34, 1, 19, 21, 2, 5};

    public static void main(String[] args) {
        int[] result = sort(arr);
        for (int i : result) {
            System.out.print(i + ",");
        }
    }

    private static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = i+1;
            while(j<arr.length && j >0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        return arr;
    }
}
