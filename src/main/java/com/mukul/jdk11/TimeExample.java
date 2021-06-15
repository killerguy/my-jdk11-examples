package com.mukul.jdk11;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TimeExample {
    public static void main(String[] args) {
        long day = TimeUnit.DAYS.convert (Duration.ofHours (24));

        System.out.println (day == 1);

        System.out.println (TimeUnit.DAYS.convert (Duration.ofHours (26)));
        System.out.println (TimeUnit.DAYS.convert (Duration.ofHours (72)));

        System.out.println (TimeUnit.MINUTES.convert (Duration.ofSeconds (60)));
    }
}
