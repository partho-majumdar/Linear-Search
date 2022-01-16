package com.partho;

public class MaxValue2DArray {
    public static void main(String[] args) {
        int[][] arr2d = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int ans = searchMax(arr2d);
        System.out.println("Maximum value form this array is : " + ans);

    }

    static int searchMax(int[][] arr2d) {
        int maxValue = Integer.MIN_VALUE;

        for (int[] ints : arr2d) {
            for (int anInt : ints) {
                if (anInt > maxValue) {
                    maxValue = anInt;
                }
            }
        }
        return maxValue;
    }
}
