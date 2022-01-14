package com.partho;

public class MinValue {
    public static void main(String[] args) {
        int[] arr = {18, 11, 17, -69, 14, 21, 28};
        int ans = minimumValue(arr);
        System.out.println("Minimum value is ==> " + ans);
    }

    static int minimumValue(int[] arr2) {
        int min = arr2[0];
        for (int j : arr2) {
            if (min > j) {
                min = j;
            }
        }
        return min;
    }
}
