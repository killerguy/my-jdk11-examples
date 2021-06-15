package com.mukul.jdk11;

import java.util.stream.IntStream;

public class VarInLambdaExample {
    public static void main(String[] args) {
        IntStream.of (1, 2, 3, 5, 6, 7)
                .filter ((var i) -> i % 2 == 0)
                .forEach (System.out::println);
        System.out.println ("---------");
        IntStream.of(1, 2, 3, 5, 6, 7)
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);

    }
}
