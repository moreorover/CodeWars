package org.example;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        return Arrays.stream(args).sorted().distinct().toArray()[0];
//        return IntStream.of(args).min().getAsInt();
    }
}
