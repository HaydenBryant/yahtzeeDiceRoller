package com.spring.hockeystats;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Die {

//    public final AtomicInteger count = new AtomicInteger(0);
//    public int id;
    public int value;

    Random rand = new Random();


    public void roll(){
        setValue(rand.nextInt(6) + 1);
    }

    public Die() {
//        this.id = count.incrementAndGet();
        this.value = rand.nextInt(6) + 1;
    }

    @Override
    public String toString() {
        return "Die{" +
                "value=" + value +
                '}';
    }

//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
