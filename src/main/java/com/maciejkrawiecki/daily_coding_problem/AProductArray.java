package com.maciejkrawiecki.daily_coding_problem;


/**
 * Given an array of integers, return a new array such that
 * each element at index i of the new array is the product of all the numbers in the original array
 * except the one at i.
 * For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24].
 * If our input was [3, 2, 1], the expected output would be [2, 3, 6].
 */

public class AProductArray {


    public static int[] generateProductArray1(int[] arr) {

        int[] productArr = new int[arr.length];

        for (int i = 0; i < productArr.length; i++) {

            int currentPoduct = 1;

            for (int j = 0; j < productArr.length; j++) {

                if (j != i) {
                    currentPoduct *= arr[j];
                }
            }

            productArr[i] = currentPoduct;
        }
        return productArr;
    }


    public static int[] generateProductArray2(int[] arr) {

        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] productArr = new int[n];

        left[0] = 1;
        right[n - 1] = 1;

        for (int i = 1; i < n; i++) {
            left[i] = arr[i - 1] * left[i - 1];
        }

        for (int j = n - 2; j >= 0; j--) {
            right[j] = arr[j + 1] * right[j + 1];
        }

        for (int i = 0; i < n; i++) {
            productArr[i] = left[i] * right[i];
        }
        return productArr;
    }
}
