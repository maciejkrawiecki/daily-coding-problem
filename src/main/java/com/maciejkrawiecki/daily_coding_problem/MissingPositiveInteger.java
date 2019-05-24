package com.maciejkrawiecki.daily_coding_problem;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Given an array of integers, find the first missing positive integer in linear time and constant space.
 * In other words, find the lowest positive integer that does not exist in the array.
 * The array can contain duplicates and negative numbers as well.
 * For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
 */

public class MissingPositiveInteger {

    public static int findMissingPositiveInteger(int[] arr) {

        if (Arrays.stream(arr).allMatch(x -> x <= 0)) return 1;
        Arrays.sort(arr);
        Set<Integer> sortedSet = Arrays.stream(arr).filter(x -> x > 0).boxed().collect(Collectors.toCollection(LinkedHashSet::new));
        Iterator<Integer> iterator = sortedSet.iterator();
        int i = 1;

        while (iterator.hasNext()) {
            int tmp = iterator.next();
            if (tmp != i) return i;
            else i++;
        }
        if (i == sortedSet.size() + 1) return i;

        return 1;
    }
}
