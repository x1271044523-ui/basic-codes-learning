package com.xjh.recursion;

public class QuickSortDemo {
    public static void main(String[] args) {
        int[] arr = {23, 42, 12, 3, 54, 65, 234, 5, 65, 3234, 34};

        quickSort(0, arr.length - 1, arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void quickSort(int i, int j, int[] arr) {
        int start = i;
        int end = j;
        int baseNumber = arr[i];
        if (i >= j) {
            return;
        }
        while (start != end) {

            while (end > start && arr[end] >= baseNumber) {
                end--;
            }
            while (end > start && arr[start] <= baseNumber) {
                start++;
            }
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;

        quickSort(i, start - 1, arr);
        quickSort(start + 1, j, arr);

    }
}
