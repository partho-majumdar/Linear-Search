package com.partho;

public class EvenNumDigit {
    public static void main(String[] args) {
        int[] numbers = {12, 345, 2, 6, 7896};
        int ans = findNumbers(numbers);
        System.out.println("Number with even number of digit is : " + ans);
    }

    static int findNumbers(int[] arr) {
        int count2 = 0;

        for (int value : arr) {
            if (even(value)) {
                count2++;
            }
        }
        return count2;
    }

    static boolean even(int num) {
        int numOfDigit = digits(num);
        return numOfDigit % 2 == 0;
    }

    static int digits(int num2) {
        int count = 0;

        if (num2 < 0) {
            return num2 * -1;
        }

        if (num2 == 0) {
            return 1;
        }

        while (num2 > 0) {
            count++;
            num2 = num2 / 10;
        }
        return count;
    }
}
