package com.partho;

public class ReturnIndex {
    public static void main(String[] args) {
        int[] arr = {18, 13, 17, 69, 19, 15, 11};
        int target = 69;
        int ans = linearSearch(arr, target);
        System.out.println(target + " " + "index is ==> " + ans);
    }

    static int linearSearch(int[] arr2, int target) {
        if (arr2.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr2.length; index++) {
            int element = arr2[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}
