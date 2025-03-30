package com.mycompany.myapp.domain;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class MessageTestSamples {

    private static final Random random = new Random();
    private static final AtomicLong longCount = new AtomicLong(random.nextInt() + (2 * Integer.MAX_VALUE));
    private static final AtomicInteger intCount = new AtomicInteger(random.nextInt() + (2 * Short.MAX_VALUE));

    public static Message getMessageSample1() {
        return new Message().id(1L).priority(1).topic("topic1").data("data1");
    }

    public static Message getMessageSample2() {
        return new Message().id(2L).priority(2).topic("topic2").data("data2");
    }

    public static Message getMessageRandomSampleGenerator() {
        return new Message()
            .id(longCount.incrementAndGet())
            .priority(intCount.incrementAndGet())
            .topic(UUID.randomUUID().toString())
            .data(UUID.randomUUID().toString());
    }
}
