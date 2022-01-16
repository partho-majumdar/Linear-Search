package com.partho;

public class RichCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 5}, {7, 3}, {3, 5}
        };

        int ans = maxWealth(accounts);
        System.out.println((ans));
    }

    static int maxWealth(int[][] accounts2) {

        int ans = Integer.MIN_VALUE;

        for (int[] ints : accounts2) {

            int sum = 0;

            for (int anInt : ints) {
                sum = sum + anInt;
            }

            if (sum > ans) {
                ans = sum;

            }
        }
        return ans;
    }
}
























/*
    public static void main(String[] args) {
        int[][] account = {
                {1, 5}, {7, 3}, {3, 5}
        };

        int[] ans = maxWealth(account);
        System.out.println(Arrays.toString(ans));

    }

    static int maxWealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int sum = 0;

            for (int j = 0; j < account.length; j++) {
                sum += j;
            }

            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
 */