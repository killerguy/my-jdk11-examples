package com.mukul.jdk10;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class CollectionsCopyOfExample {
    public static void main(String[] args) {
        createCopyOfList();
        createCopyOfSet ();
        createCopyOfMap ();
    }

    private static void createCopyOfList(){
        var numbers = integers()
                .limit(5)
                .collect(toList());

        var copy = List.copyOf(numbers);

        System.out.println ("Copy Of List are Equal: "+copy.equals (numbers));
        try {
            System.out.println (copy.add (11));
        }
        catch (UnsupportedOperationException exception){
            System.out.println ("UnsupportedOperationException Occurred");
        }

    }

    private static void createCopyOfMap() {
        var shipsByCharacter = Map.of(
                "Luke", "X-Wing",
                "Han", "Millennium Falcon",
                "Wedge", "X-Wing",
                "Vader", "TIE Advanced X-1",
                "Leia", "Tantive IV"
        );

        var copy = Map.copyOf(shipsByCharacter);

        System.out.println ("Copy Of Map are Equal: "+copy.equals (shipsByCharacter));

        try {
            System.out.println (copy.put("Bob Feet", "Slave I"));
        }
        catch (UnsupportedOperationException exception){
            System.out.println ("UnsupportedOperationException Occurred");
        }
    }

    private static void createCopyOfSet() {
        var numbers = integers()
                .limit(25)
                .collect(toSet());

        var copy = Set.copyOf(numbers);

        System.out.println ("Copy Of Set are Equal: "+copy.equals (numbers));
        try {
            System.out.println (copy.add (42));
        }
        catch (UnsupportedOperationException exception){
            System.out.println ("UnsupportedOperationException Occurred");
        }
    }



    private static Stream<Integer> integers() {
        return Stream.iterate(1, integer -> integer + 1);
    }
}
