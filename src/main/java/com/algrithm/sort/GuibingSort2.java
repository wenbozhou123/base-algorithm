package com.algrithm.sort;


/**
 * 归并排序非递归
 * */
public class GuibingSort2 {

    private static int[] arr = {2, 0, 9, 1, 6, 7, 4, 12, 10, 22, 34, 1, 19, 21, 2, 5};

    public static void main(String[] args) {

    }

    /**
     * 两两归并排好序的数组（2路归并）
     *
     * @param nums   带排序数组对象
     * @param left   左边数组的第一个索引
     * @param center 左数组的最后一个索引，center + 1右数组的第一个索引
     * @param right  右数组的最后一个索引
     */
    private static void merge(int[] nums, int left, int center, int right) {
        int[] tmpArray = new int[right - left + 1];
        int leftIndex = left;   //左数组第一个元素的索引
        int rightIndex = center + 1;   //右数组第一个元素索引
        int tmpIndex = 0;    //临时数组索引

        // 把较小的数先移到新数组中
        while (leftIndex <= center && rightIndex <= right) {
            if (nums[leftIndex] <= nums[rightIndex]) {
                tmpArray[tmpIndex++] = nums[leftIndex++];
            } else {
                tmpArray[tmpIndex++] = nums[rightIndex++];
            }
        }

        // 把左边剩余的数移入数组
        while (leftIndex <= center) {
            tmpArray[tmpIndex++] = nums[leftIndex++];
        }

        // 把右边边剩余的数移入数组
        while (rightIndex <= right) {
            tmpArray[tmpIndex++] = nums[rightIndex++];
        }

        // 把新数组中的数覆盖nums数组
    /*for (int i = 0; i < tmpArray.length; i++) {
        nums[begin + i] = tmpArray[i];
    }*/
        //可以优化成下面的写法
        System.arraycopy(tmpArray, 0, nums, left, tmpArray.length);
    }

}
