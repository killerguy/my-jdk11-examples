package com.mukul.jdk10;

import java.util.Optional;

public class OrElseThrowExample {
    public static void main(String[] args) throws MyElseThrowException {

        var personValidOptional = Optional.of(new Person("Bob", "Smith"));
        System.out.println (personValidOptional.get ().getFullName ());

        var personOptional = Optional.<Person>empty();

        System.out.println (personOptional.orElseThrow(()-> new MyElseThrowException ("No Results Found")));
    }
}

class MyElseThrowException extends Exception{
    public MyElseThrowException(String message) {
        super (message);
    }
}