package com.maciejkrawiecki.daily_coding_problem;

import java.util.Arrays;

/**
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 */

public class SumOfTwoNumbers {

    public static boolean containsPairWithSum(int[] arr, int k) {

        Arrays.sort(arr);
        int i = 0, j = arr.length - 1;

        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum > k) {
                j--;
            } else if (sum < k) {
                i++;
            } else return true;
        }
        return false;

    }
}
