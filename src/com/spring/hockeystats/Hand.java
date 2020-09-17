package com.spring.hockeystats;

import java.util.ArrayList;

public class Hand {

    public ArrayList<Die> hand;

    @Override
    public String toString() {
        return "Hand{" +
                "hand=" + hand +
                '}';

        //for each loop calling each dies toString method
    }

    public Hand(ArrayList<Die> hand) {
        this.hand = hand;
    }

    public ArrayList<Die> getHand() {
        return hand;
    }

    public void setHand(ArrayList<Die> hand) {
        this.hand = hand;
    }
}
