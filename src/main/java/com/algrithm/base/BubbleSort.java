package com.algrithm.base;

/**
 * 冒泡排序
 */
public class BubbleSort {
    private static int[] arr={2,0,9,1,6,7,4,12,10,22,34,1,19,21,2,5};
    public static void main(String[] args) {
        int[] result=sort(arr);
        for(int i: result){
            System.out.print(i+",");
        }

    }

    private static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

}
