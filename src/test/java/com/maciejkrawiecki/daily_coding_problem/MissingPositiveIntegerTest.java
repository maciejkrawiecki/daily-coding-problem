package com.maciejkrawiecki.daily_coding_problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MissingPositiveIntegerTest {

    @Test
    public void findMissingPositiveInteger() {

        // given

        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {-1, -1};
        int[] arr3 = {0};
        int[] arr4 = {};
        int[] arr5 = {11, 11, 100, -110, -44, -21, 2};
        int[] arr6 = {11, 100, -110, -44, -21, 2, 0};
        int[] arr7 = {-1, -1, -1};
        int[] arr8 = {1, 1, 2, 5, 5, 3, 3, 2, 2, 2, 2, -2, 0};
        int[] arr9 = {1, 1, 1, 2, 3, 5, 6};
        int[] arr10 = {-1, 0, 1, 2, 2, 2, 1};

        // when

        int result1 = MissingPositiveInteger.findMissingPositiveInteger(arr1);
        int result2 = MissingPositiveInteger.findMissingPositiveInteger(arr2);
        int result3 = MissingPositiveInteger.findMissingPositiveInteger(arr3);
        int result4 = MissingPositiveInteger.findMissingPositiveInteger(arr4);
        int result5 = MissingPositiveInteger.findMissingPositiveInteger(arr5);
        int result6 = MissingPositiveInteger.findMissingPositiveInteger(arr6);
        int result7 = MissingPositiveInteger.findMissingPositiveInteger(arr7);
        int result8 = MissingPositiveInteger.findMissingPositiveInteger(arr8);
        int result9 = MissingPositiveInteger.findMissingPositiveInteger(arr9);
        int result10 = MissingPositiveInteger.findMissingPositiveInteger(arr10);

        // then

        assertEquals(7, result1);
        assertEquals(1, result2);
        assertEquals(1, result3);
        assertEquals(1, result4);
        assertEquals(1, result5);
        assertEquals(1, result6);
        assertEquals(1, result7);
        assertEquals(4, result8);
        assertEquals(4, result9);
        assertEquals(3, result10);

    }
}