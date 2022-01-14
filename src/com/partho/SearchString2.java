package com.partho;

import java.util.Arrays;

public class SearchString2 {
    public static void main(String[] args) {
        String name = "kanu";
        char target = 'a';

//        System.out.println(Arrays.toString(name.toCharArray()));

        boolean ans = findTargetChar(name, target);
        System.out.println(ans);
    }

    static boolean findTargetChar(String name2, char target) {
        if (name2.length() == 0) {
            return false;
        }

        for (char element : name2.toCharArray()) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }
}
