package kyu7;

/*
Simple, given a string of words, return the length of the shortest word(s).

String will never be empty and you do not need to account for different data types.
 */

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ShortestWord {
    public static int findShort(String s) {
//        String[] tab = s.split(" ");
//        int min = Integer.MAX_VALUE;
//        for (String str : tab) {
//            min = Math.min(str.length(), min);
//        }
//        return min;

        return Stream.of(s.split(" "))
                .mapToInt(String::length)
                .min()
                .getAsInt();
    }
}
