package com.partho;

import java.util.Arrays;

public class SearchString {
    public static void main(String[] args) {
        String name = "kunal";
        char target = 'u';
        boolean ans = findTargetChar(name, target);
        System.out.println(ans);
    }

    static boolean findTargetChar(String name2, char target) {
        if (name2.length() == 0) {
            return false;
        }
        for (int i = 0; i < name2.length(); i++) {
            char element = name2.charAt(i);
            if (element == target) {
                return true;
            }
        }
        return false;
    }
}
