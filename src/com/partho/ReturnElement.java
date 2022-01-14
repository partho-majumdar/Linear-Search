package com.partho;

public class ReturnElement {
    public static void main(String[] args) {
        int[] arr = {18, 13, 17, 22, 28, 21, 11, 27, 14, 19};
        int target = 288;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr2, int target) {
        if (arr2.length == 0) {
            return Integer.MAX_VALUE;
        }
        for (int element : arr2) {
            if (element == target) {
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }
}
