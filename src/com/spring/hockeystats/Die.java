package com.spring.hockeystats;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Die {

//    public final AtomicInteger count = new AtomicInteger(0);
//    public int id;
    private int value;

    Random rand = new Random();


    public void roll(){
        value = (rand.nextInt(6) + 1);
    }

    public Die() {
        this.value = rand.nextInt(6) + 1;
    }

    @Override
    public String toString() {
        return "Die{" +
                "value=" + value +
                '}';
    }

    public int getValue() {
        return value;
    }
}
