package com.mukul.jdk10;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class UnmodifiableCollectorTest {
    public static void main(String[] args) {
        createUnmodifiableList ();
        createUnmodifiableMap ();
        createUnmodifiableSet ();
    }

    private static void createUnmodifiableList() {
        var numbers = integers()
                .limit(10)
                .collect(toUnmodifiableList());

        try {
            System.out.println (numbers.add (42));
        }
        catch (UnsupportedOperationException exception){
            System.out.println ("UnsupportedOperationException Occurred");
        }
    }

    public static void createUnmodifiableMap() {
        var words = List.of(
                "the", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "brown", "dog"
        );

        Map<String, Integer> wordCounts = words.stream()
                .collect(toUnmodifiableMap(word -> word, word -> 1, Integer::sum));

        try {
            System.out.println (wordCounts.put ("red",3));
        }
        catch (UnsupportedOperationException exception){
            System.out.println ("UnsupportedOperationException Occurred");
        }
    }

    public static void createUnmodifiableSet() {
        var numbers = integers()
                .limit(10)
                .collect(toList());
        var moreNumbers = integers()
                .limit(15)
                .collect(toList());

        System.out.println (numbers.addAll(moreNumbers));

        var uniqueNumbers = numbers.stream().collect(toUnmodifiableSet());

        try {
            System.out.println (uniqueNumbers.add (16));
        }
        catch (UnsupportedOperationException exception){
            System.out.println ("UnsupportedOperationException Occurred");
        }
    }

    private static Stream<Integer> integers() {
        return Stream.iterate(1, integer -> integer + 1);
    }
}
