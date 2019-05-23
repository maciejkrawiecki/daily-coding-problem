package com.maciejkrawiecki.daily_coding_problem;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class AProductArrayTest {


    @Test
    public void generateProductArray1() {

        // given

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 2, 1};

        int[] productArr1 = {120, 60, 40, 30, 24};
        int[] productArr2 = {2, 3, 6};

        // when

        int[] result1 = AProductArray.generateProductArray1(arr1);
        int[] result2 = AProductArray.generateProductArray1(arr2);

        // then

        assertArrayEquals(result1, productArr1);
        assertArrayEquals(result2, productArr2);
    }

    @Test
    public void generateProductArray2() {

        // given

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 2, 1};

        int[] productArr1 = {120, 60, 40, 30, 24};
        int[] productArr2 = {2, 3, 6};

        // when

        int[] result1 = AProductArray.generateProductArray2(arr1);
        int[] result2 = AProductArray.generateProductArray2(arr2);

        // then

        assertArrayEquals(result1, productArr1);
        assertArrayEquals(result2, productArr2);
    }
}