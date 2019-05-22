package com.maciejkrawiecki.daily_coding_problem;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SumOfTwoNumbersTest {

    @Test
    public void containsPairWithSum() {

        // given

        int[] arr1 = {4, 5, 33, 131, 34, 78, 24};
        int[] arr2 = {-11, 5, 11, 3};
        int[] arr3 = {10, 15, 3, 7};
        int[] arr4 = {-1, -55, -23, -12, -88};
        int[] arr5 = {-2, 1, -1};
        int[] arr6 = {};

        int k1 = 135;
        int k2 = 0;
        int k3 = 17;
        int k4 = -100;
        int k5 = 2;
        int k6 = 0;

        // when

        boolean result1 = SumOfTwoNumbers.containsPairWithSum(arr1, k1);
        boolean result2 = SumOfTwoNumbers.containsPairWithSum(arr2, k2);
        boolean result3 = SumOfTwoNumbers.containsPairWithSum(arr3, k3);
        boolean result4 = SumOfTwoNumbers.containsPairWithSum(arr4, k4);
        boolean result5 = SumOfTwoNumbers.containsPairWithSum(arr5, k5);
        boolean result6 = SumOfTwoNumbers.containsPairWithSum(arr6, k6);

        // then

        assertTrue(result1);
        assertTrue(result2);
        assertTrue(result3);
        assertTrue(result4);
        assertFalse(result5);
        assertFalse(result6);
    }
}