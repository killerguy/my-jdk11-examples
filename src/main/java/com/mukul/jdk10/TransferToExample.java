package com.mukul.jdk10;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class TransferToExample {

    public static void main(String[] args) throws IOException {
        var phrase = "The red fox jumped over the lazy brown dog";
        var reader = new StringReader (phrase);
        var writer = new StringWriter ();
        var transferCount = reader.transferTo (writer);

        System.out.println (transferCount);
        System.out.println (writer.toString ().equals (phrase));
    }
}
