package com.partho;

public class ReturnTorF {
    public static void main(String[] args) {
        int[] arr = {17, 11, 19, 15, 28, 13, 21, 16};
        int target = 228;
        boolean ans = linearSearch(arr, target);
        System.out.println(ans);
    }

    static boolean linearSearch(int[] arr2, int target) {
        if (arr2.length == 0) {
            return false;
        }
        for (int element : arr2) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }
}
