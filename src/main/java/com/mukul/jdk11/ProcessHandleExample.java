package com.mukul.jdk11;

import java.util.Optional;

public class ProcessHandleExample {
    public static void main(String[] args) throws Exception {
        ProcessHandle currentProcess = ProcessHandle.current();

        System.out.println("Process PID = " + currentProcess.pid());
        System.out.println("Process Parent = " + currentProcess.parent().get ());

        Optional<ProcessHandle> noParentProcess = Optional.ofNullable (currentProcess.parent ())
                .orElseThrow (() -> new Exception ("Please No Parent Process"));
        System.out.println (noParentProcess.get ());
    }
}
