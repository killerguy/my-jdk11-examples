package com.mukul.jdk11;

interface InterfaceExample {
    void normalInterfaceMethod();
    default void interfaceMethodWithDefault() {
        init();
    }

    default void anotherDefaultMethod() {
        System.out.println ("This is default method implementation for Interface");
    }


    private void init() {
        System.out.println("This is private default interface method. ");
    }
}

public class InterfaceExampleImpl implements InterfaceExample {

    @Override
    public void normalInterfaceMethod() {
        System.out.println ("Normal Interface Method Implemented");
    }

    @Override
    public void interfaceMethodWithDefault() {
        InterfaceExample.super.interfaceMethodWithDefault ();
    }


    public static void main(String[] args) {
        var intExample = new InterfaceExampleImpl ();
        intExample.anotherDefaultMethod ();
        intExample.interfaceMethodWithDefault ();
        intExample.normalInterfaceMethod ();
    }
}