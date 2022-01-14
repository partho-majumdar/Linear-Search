package com.partho;

public class SearchInRange {
    public static void main(String[] args) {

        // search for 13 in the range of index [1-5] and ans is ==> 3

        int[] arr = {18, 11, 17, 13, 16, 15, 12};
        int target = 13;
        int ans = linearSearch(arr, target, 1, 5);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr2, int target, int start, int end) {
        if (arr2.length == 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            int element = arr2[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }
}
