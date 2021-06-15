package com.mukul.jdk11;

import java.util.stream.Collectors;

public class StringExamples {

    public static void main(String[] args) {
        verifyBlankFunction ();
        verifyLinesFunction ();
        verifyRepeatFunction ();
        verifyStripFunction ();
    }


    private static void verifyBlankFunction(){
        System.out.println(" ".isBlank()); //true

        String s = "anyString";
        System.out.println(s.isBlank()); //false
        String s1 = "";
        System.out.println(s1.isBlank()); //true
    }

    private static void verifyLinesFunction(){
        String str = "Test\nTest\nTest";
        System.out.println(str);
        System.out.println(str.lines().collect(Collectors.toList()));
    }

    private static void verifyStripFunction(){
        String str = " Test ";
        System.out.print("Start");
        System.out.print(str.strip());
        System.out.println("End");

        System.out.print("Start");
        System.out.print(str.stripLeading());
        System.out.println("End");

        System.out.print("Start");
        System.out.print(str.stripTrailing());
        System.out.println("End");
    }

    private static void verifyRepeatFunction(){
        String str = "=".repeat(2);
        System.out.println(str);
    }

}

